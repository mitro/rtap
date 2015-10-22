package kz.dtech.rt.ap.rest.resources;

import kz.dtech.rt.ap.domain.Violation;
import kz.dtech.rt.ap.ws.client.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBElement;

import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * @author Dmitriy Melnik (d.b.melnik@yandex.ru) on 20.10.15.
 */
@Path("/violations")
@Produces(APPLICATION_JSON)
public class ViolationsResource {

  @GET
  @Path("/")
  public List<Violation> getViolations() {
    IViolationGet service = new ViolationGet().getBasicHttpBindingIViolationGet();

    ObjectFactory objectFactory = new ObjectFactory();

    ViolationGetWcfParams params = new ViolationGetWcfParams();
    JAXBElement<String> srts = objectFactory.createViolationGetWcfParamsNumberSrts("AS00081467");
    JAXBElement<String> transportNumber = objectFactory.createViolationGetWcfParamsTransportNumber("077FSA02");
    params.setNumberSrts(srts);
    params.setTransportNumber(transportNumber);

    List<ViolationGetWcfData> violations = service.getViolations(params, null).getViolationGetWcfData();

    List<Violation> mappedViolations = new ArrayList<Violation>();
    for (ViolationGetWcfData violation: violations) {
      Violation mappedViolation = createViolation(violation);
      mappedViolations.add(mappedViolation);
    }

    return mappedViolations;
  }

  private Violation createViolation(ViolationGetWcfData violationData) {
    return new Violation(
      "077FSA02",
      violationData.getColor().getValue(),
      violationData.getFixationDate().toGregorianCalendar().getTime(),
      violationData.getFineCost().doubleValue(),
      violationData.isIsLegalEntity().booleanValue(),
      violationData.isIsRepeat().booleanValue(),
      violationData.getModel().getValue(),
      violationData.getOrderNumber().getValue(),
      violationData.getPostAddress().getValue(),
      violationData.getViolationStatusEnum().value(),
      violationData.getViolationStatus().getValue(),
      violationData.getViolationStatusKz().getValue(),
      violationData.getViolationType().getValue(),
      violationData.getViolationTypeKz().getValue(),
      violationData.getViolationTypeShort().getValue(),
      violationData.getViolatorFirstName().getValue(),
      violationData.getViolatorSecondName().getValue(),
      violationData.getViolatorLastName().getValue(),
      violationData.getViolatorFullName().getValue()
    );
  }
}
