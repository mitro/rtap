package kz.dtech.rt.ap.domain;

import java.util.Date;

/**
 * @author Dmitriy Melnik (d.b.melnik@yandex.ru) on 21.10.15.
 */
public class Violation {
  private final String color;
  private final Date fixationDate;
  private final double fineCost;
  private final boolean isLegalEntity;
  private final boolean isRepeated;
  private final String model;
  private final String orderNumber;
  private final String postAddress;
  private final String status;
  private final String statusNameRu;
  private final String statusNameKz;
  private final String typeNameRu;
  private final String typeNameKz;
  private final String typeNameShort;
  private final String driverFirstName;
  private final String driverSecondName;
  private final String driverLastName;
  private final String driverFullName;

  public Violation(String color, Date fixationDate, double fineCost, boolean isLegalEntity, boolean isRepeated, String model, String orderNumber, String postAddress, String status, String statusNameRu, String statusNameKz, String typeNameRu, String typeNameKz, String typeNameShort, String driverFirstName, String driverSecondName, String driverLastName, String driverFullName) {
    this.color = color;
    this.fixationDate = fixationDate;
    this.fineCost = fineCost;
    this.isLegalEntity = isLegalEntity;
    this.isRepeated = isRepeated;
    this.model = model;
    this.orderNumber = orderNumber;
    this.postAddress = postAddress;
    this.status = status;
    this.statusNameRu = statusNameRu;
    this.statusNameKz = statusNameKz;
    this.typeNameRu = typeNameRu;
    this.typeNameKz = typeNameKz;
    this.typeNameShort = typeNameShort;
    this.driverFirstName = driverFirstName;
    this.driverSecondName = driverSecondName;
    this.driverLastName = driverLastName;
    this.driverFullName = driverFullName;
  }
}
