package com.example.Digital.Wallet.and.UPI.Payment.System.model;
import jakarta.persistence.*;

@Entity
@Table(name = "billers")
public class Biller {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code; 
    public Biller() {}
    
}
