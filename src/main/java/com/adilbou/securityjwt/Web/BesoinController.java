package com.adilbou.securityjwt.Web;//package com.adilbou.securityjwt.Web;
//
//
//import com.adilbou.securityjwt.Entities.Besoin;
//import com.adilbou.securityjwt.Repositories.BesoinRepository;
//import com.adilbou.securityjwt.Repositories.MemberRepository;
//import com.adilbou.securityjwt.Repositories.RoleRepository;
//import com.adilbou.securityjwt.Repositories.UserRepository;
//import com.adilbou.securityjwt.Service.BesoinService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.sql.Date;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Collection;

import com.adilbou.securityjwt.Entities.Besoin;
import com.adilbou.securityjwt.service.BesoinService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1/Besoin-Controller")
//
//@CrossOrigin("*")
public class BesoinController implements BesoinService  {

   private final BesoinService besoinService;

    public BesoinController(BesoinService besoinService) {
        this.besoinService = besoinService;
    }

    //
//  @Autowired
//    UserRepository userRepository;
//    @Autowired
//    RoleRepository roleRepository;
//
//
//    @Autowired
//    MemberRepository membreDepartementRepository;
//
//    @Autowired
//    BesoinRepository besoinRepository;
//
//
//
//    public BesoinController(BesoinService besoinService) {
//        this.besoinService = besoinService;
//    }
//
////    @GetMapping("")
////    public List<Besoin> getAllBesoins() {
////        return besoinService.getAllBesoins();
////    }
//
//   // @PostMapping("")
//

    @PostMapping("/save")
    @Override
    public Besoin save(Besoin besoin) {
        return besoinService.save(besoin);
    }
//
//
}
