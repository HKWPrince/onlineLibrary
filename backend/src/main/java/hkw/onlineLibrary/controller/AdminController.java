// package hkw.onlineLibrary.controller;

// import hkw.onlineLibrary.controller.request.AdminPageRequest;
// import hkw.onlineLibrary.controller.request.LoginRequest;
// import hkw.onlineLibrary.service.IAdminService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// @CrossOrigin
// @RestController
// @RequestMapping("/admin")
// public class AdminController {

//     @Autowired
//     IAdminService adminService;

//     @PostMapping("/login")
//     public Result login(@RequestBody LoginRequest request) {
//         return Result.success(adminService.login(request));
//     }

//     @PostMapping("/save")
//     public Result save(@RequestBody Admin admin) {
//         adminService.save(admin);
//         return Result.success();
//     }
    



// }
