package com.api.parkingcontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT") //CRIAR A TABELA
public class ParkingSpotModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id //CHAVE
    @GeneratedValue(strategy = GenerationType.AUTO) //INSERI ID AUTOMATICO
    private UUID id;

    //@COLUMN - CRIA AS COLUNAS NA TABELA.
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumeber;

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    @Column(nullable = false, length = 70)
    private String brandCar;

    @Column(nullable = false, length = 70)
    private String modelCar;

    @Column(nullable = false,  length = 70)
    private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false,  length = 130)
    private String responsibleName;

    @Column(nullable = false,  length = 30)
    private String apartement;

    @Column(nullable = false,  length = 30)
    private String block;


    //METODOS GETS E SETS
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumeber() {
        return parkingSpotNumeber;
    }

    public void setParkingSpotNumeber(String parkingSpotNumeber) {
        this.parkingSpotNumeber = parkingSpotNumeber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartement() {
        return apartement;
    }

    public void setApartement(String apartement) {
        this.apartement = apartement;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
