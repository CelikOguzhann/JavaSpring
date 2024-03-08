package com.Spring.DependencyInjection.Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


        /*

            Field Injection          :  Tavsiye edilmez. Nedeni Unit Test ederken genelde sınıflar elle yazılır ve set etmek zordur.
            Setter Injection         :  Setter ile olabilir fakat classı oluştururken bütün parametreleri elle verilmektedir. Set edilme ihtimali unutulabilir!!!!
            Constructor Injection    :  En iyisi ve mantıklısı constructor injection'dur. Görünür , Temiz kod ve daha güvenli olduğu için tercih edilmelidir !!!!!!

         */


@RestController
@RequestMapping("/injection")
public class myControllerr {

    @Autowired
    private FirstClass firstClass;

    @Autowired
    private SecondClass secondClass;

    @Autowired
    private  ThirdClass thirdClass;


    // Field İnjection----------

    @GetMapping("/names")
    public String getname(){
        return this.firstClass.getName() + " - " +
                this.secondClass.getName() + " - " +
                this.thirdClass.getName() ;
    }

    // Setter İnjection --------


    public void setSecondClass(SecondClass secondClass){
        this.secondClass = secondClass;

    }

    // Costructor İnjection -------

    public myControllerr(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }




//    @Autowired
//    public myControllerr(FirstClass firstClass, SecondClass secondClass, ThirdClass thirdClass) {
//        this.firstClass = firstClass;
//        this.secondClass = secondClass;
//        this.thirdClass = thirdClass;
//    }
}
