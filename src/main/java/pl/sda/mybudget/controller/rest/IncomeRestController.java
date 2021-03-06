package pl.sda.mybudget.controller.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.mybudget.model.Income;
import pl.sda.mybudget.model.enumeration.IncomeType;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/rest/income")
public class IncomeRestController {

    @GetMapping
    List<Income> getAllIncome(){
        return List.of(
                new Income(1_000, LocalDate.now(), "Od żony", IncomeType.MOPS),
                new Income(5_00_000, LocalDate.now(), "500++", IncomeType.MOPS)

        );


    }



}
