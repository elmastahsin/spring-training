package com.company.bootstrap;

import com.company.entity.Merchant;
import com.company.entity.Payment;
import com.company.entity.PaymentDetail;
import com.company.enums.Status;
import com.company.repository.PaymentRepository;
import com.company.repository.MerchantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;


    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Payment payment1 = new Payment(LocalDate.of(2021, 1, 1), BigDecimal.valueOf(100), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(BigDecimal.valueOf(90), BigDecimal.valueOf(10), LocalDate.of(2021, 1, 2));

        payment1.setPaymentDetail(paymentDetail1);
        Payment payment2 = new Payment(LocalDate.of(2021, 1, 2), BigDecimal.valueOf(200), Status.SUCCESS);
        PaymentDetail paymentDetail2 = new PaymentDetail(BigDecimal.valueOf(180), BigDecimal.valueOf(20), LocalDate.of(2021, 1, 3));

        payment2.setPaymentDetail(paymentDetail2);
        Merchant merchant1 = new Merchant("AmazonSubMerchant","M123",new BigDecimal("0.25"),new BigDecimal("3.25"),5);
        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        merchantRepository.save(merchant1);

        paymentRepository.save(payment1);
        paymentRepository.save(payment2);




//        System.out.println(paymentRepository.findById(2L).get().getPaymentDetail().getComissionAmount());

//        paymentRepository.delete(payment1);
    }
}
