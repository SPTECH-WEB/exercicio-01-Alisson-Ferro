package com.fatura.apifatura.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "faturas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Não pode ser nulo")
    @Digits(integer = 16, fraction = 4, message = "Tem que ter 16 dígitos numéricos")
    private String numero;

    @NotNull(message = "Não pode ser nulo")
    @Size(min = 3, max = 100, message = "O nome do Titular deve ter entre 3 e 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "Não pode ser nulo")
    @DecimalMax(value = "5000.00", message = "No maximo 5k")
    @DecimalMin(value = "10.00", message = "No minimo 10 conto")
    private Double valor;

    @NotNull(message = "Não pode ser nulo")
    @FutureOrPresent(message = "Deve ser atual ou futura")
    private LocalDate dataPagamento;

    @NotNull
    @Email(message = "Tem que ser um e-mail valido")
    private String emailContato;
}
