package com.example.Digital.Wallet.and.UPI.Payment.System.model;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bills")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Biller biller;

    @ManyToOne
    private Wallet wallet;

    private BigDecimal amount;
    private boolean paid = false;
    private LocalDateTime dueDate;
    private LocalDateTime paidAt;
}

