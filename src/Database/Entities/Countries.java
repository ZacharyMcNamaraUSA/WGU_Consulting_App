package Database.Entities;

import java.time.Instant;
import java.time.LocalDateTime;

public class Countries {
   private int countryId;
   private String countryName;
   private LocalDateTime createDate;
   private String createdBy;
   private Instant lastUpdate;
   private String lastUpdateBy;

   public Countries(int countryId, String countryName, LocalDateTime createDate, String createdBy,
                    Instant lastUpdate, String lastUpdateBy) {
      this.countryId = countryId;
      this.countryName = countryName;
      this.createDate = createDate;
      this.createdBy = createdBy;
      this.lastUpdate = lastUpdate;
      this.lastUpdateBy = lastUpdateBy;
   }

   /** Getter for Country_ID
    * @return Returns int countryId
    */
   public int getCountryId() {
      return countryId;
   }

   /** Setter for Country_ID --- this should not be called as the field is auto-generated by the database.
    * @param id Database field Country_ID for an instantiated instance of Countries.class
    */
   public void setCountryId(int id) {
      countryId = id;
   }

   /** Getter for Country field
    * @return Returns a String of the countries name.
    */
   public String getCountryName() {
      return countryName;
   }

   /** Setter for Country field
    * @param countryName The String of a countries name.
    */
   public void setCountryName(String countryName) {
      this.countryName = countryName;
   }

   /**
    * Getting for createDate
    * @return Returns createDate
    */
   public LocalDateTime getCreateDate() {
      return createDate;
   }

   /**
    * Setter method for createDate
    * @param createDate
    */
   public void setCreateDate(LocalDateTime createDate) {
      this.createDate = createDate;
   }

   /** Getter for createdBy
    * @return Returns String cratedBy
    */
   public String getCreatedBy() {
      return createdBy;
   }

   /** Setter for createdBy
    * @param createdBy String for Username of the Users that created this record.
    *                  The field createdBy should not ever be changed.
    */
   public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
   }

   /**
    * Getter for lastUpdate
    * @return Returns an Instant of the MYSQL DATETIME of this record's most recent edit.
    *    Instant chosen to avoid potential truncation of data.
    */
   public Instant getLastUpdateTime() {
      return lastUpdate;
   }

   /** Setter for lastUpdate
    *
    * @param lastUpdate The MYSQL TIMESTAMP of this record's most recent edit.
    */
   public void setLastUpdate(Instant lastUpdate) {
      this.lastUpdate = lastUpdate;
   }

   /**
    * Getter method for lastUpdateBy
    * @return Returns a String of the most recent Users to edit this record.
    */
   public String getLastUpdateBy() {
      return lastUpdateBy;
   }

   /**
    * Setter method for lastUpdateBy
    * @param lastUpdateBy the most recent Users to edit this record.
    */
   public void setLastUpdatedBy(String lastUpdateBy) {
      this.lastUpdateBy = lastUpdateBy;
   }
}
