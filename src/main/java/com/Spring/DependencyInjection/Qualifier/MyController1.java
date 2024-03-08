package com.Spring.DependencyInjection.Qualifier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


        //                                             !!!!! ÖNEMLİ  !!!!!

        //   @Qualifier : Bizim İOC içerisinde birden çok nesne oluşmuşsa Autowired eşleme yapamaz hangisiyle yapacağını bilmez.
        //              : Bu yüzden bizim Qualifier anatosyonu ile hangi nesneyi (class) oluşturması gerektiğini söylememiz gerekiyor ki hata oluşmasın...

        //   @Primary   : Qualifier kullanmak istemiyorsak yada öncelik vermek istiyorsak Primary anatosyonunu kullaniliriz.
        //              : Bu anatosyon bizim bir class veya methoda öncelik vermemize yarıyor ve bunun sayesinde bazı durumlarda Qualifier kullanılmasına gerek olmuyor.


@RestController
@RequestMapping("/reader")
public class MyController1 {

    @Autowired
    @Qualifier ("pdfFile")         //@Qualifier ("getworldfile")  : eğer bean kullanacaksanız method ismini yazmanız gerekiyor, kullanmayacaksanız class ismi
    private Reader reader;


    @GetMapping("/read")
    public String read(){
        return this.reader.readFile();
    }

}
