package kz.dtech.rt.ap.rest.resources;

import kz.dtech.rt.ap.domain.Violation;
import kz.dtech.rt.ap.ws.client.*;
import org.eclipse.jetty.http.HttpStatus;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.xml.bind.JAXBElement;

import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * @author Dmitriy Melnik (d.b.melnik@yandex.ru) on 20.10.15.
 */
@Path("/violations")
public class ViolationsResource {

  @GET
  @Produces(APPLICATION_JSON)
  public List<Violation> getViolations(
    @QueryParam("grnz") @NotEmpty String grnz,
    @QueryParam("srts") @NotEmpty String srts) {

    IViolationGet service = new ViolationGet().getBasicHttpBindingIViolationGet();

    ObjectFactory objectFactory = new ObjectFactory();

    ViolationGetWcfParams params = new ViolationGetWcfParams();
    JAXBElement<String> srtsElement = objectFactory.createViolationGetWcfParamsNumberSrts(srts);
    JAXBElement<String> grnzElement = objectFactory.createViolationGetWcfParamsTransportNumber(grnz);
    params.setNumberSrts(srtsElement);
    params.setTransportNumber(grnzElement);

    List<ViolationGetWcfData> violations;

    try {
      violations = service.getViolations(params, null).getViolationGetWcfData();
    }
    catch (Exception ex) {
      throw new WebApplicationException(HttpStatus.SERVICE_UNAVAILABLE_503);
    }

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
