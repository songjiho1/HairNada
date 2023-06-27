package com.example.hairnada.controller.admin;

import com.example.hairnada.dto.hair.HairDto;
import com.example.hairnada.dto.store.StoreDto;
import com.example.hairnada.dto.user.UserDto;
import com.example.hairnada.service.admin.AdminFileService;
import com.example.hairnada.service.admin.AdminService;
import com.example.hairnada.vo.hair.HairVo;
import com.example.hairnada.vo.level.LevelVo;
import com.example.hairnada.vo.page.CriteriaAdmin;
import com.example.hairnada.vo.page.CriteriaAdminList;
import com.example.hairnada.vo.page.PageAdminListVo;
import com.example.hairnada.vo.page.PageAdminVo;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

@Controller
@RequestMapping("/admin/*")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final AdminFileService adminFileService;

    // 유저 리스트
    @GetMapping("/userList")
    public void memberList(CriteriaAdmin criteriaAdmin, Model model){
        List<UserDto> userList = adminService.findUserList(criteriaAdmin);
        model.addAttribute("userList", userList);
        model.addAttribute("pageInfo", new PageAdminVo(criteriaAdmin, adminService.getUserTotal()));
    }



    // 로그인
    @GetMapping("/adminLogin")
    public void adminLogin(){}

    // 배송 관리
    @GetMapping("/delivery")
    public void delivery(){}

    // 헤어 리스트
    @GetMapping("/hairList")
    public void hairList(CriteriaAdminList criteriaAdminList,Model model){
       List<HairVo> hairList = adminService.findHairList(criteriaAdminList);

        model.addAttribute("hairList", hairList);
        model.addAttribute("pageInfo", new PageAdminListVo(criteriaAdminList, adminService.getHairTotal()));

        System.out.println(hairList.toString());
    }


    // 헤어 게시글 읽기
    @GetMapping("/hairRead")
    public void hairRead(){}

    // 헤어 게시글 수정
    @GetMapping("/hairModify")
    public void hairModify(){}

    // 헤어 게시글 업로드
    @GetMapping("/hairUpload")
    public void hairUpload(){

    }

    @PostMapping("/hairUpload")
    public RedirectView hairUpload(HairDto hairDto, HttpServletRequest req, RedirectAttributes redirectAttributes
            , @RequestParam("hairFile") List<MultipartFile> files){
        adminService.registerHair(hairDto);
        redirectAttributes.addFlashAttribute("hairNumber", hairDto.getHairNumber());

        if(files != null){
            try {
                adminFileService.registerAndSaveFiles(files, hairDto.getHairNumber());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new RedirectView("/admin/hairList");
    }

    // 등업 신청 목록
    @GetMapping("/membership")
    public void membership(CriteriaAdmin criteriaAdmin, Model model){
        List<LevelVo> levelList = adminService.findLevelList(criteriaAdmin);
        model.addAttribute("levelList", levelList);
        model.addAttribute("pageInfo", new PageAdminVo(criteriaAdmin, adminService.getLevelTotal()));
    }

    // 등업 신청 게시글 읽기
    @GetMapping("/levelUp")
    public void levelUP(Long levelNumber, Model model){
        LevelVo levelVo = adminService.findLevelBoard(levelNumber);
        model.addAttribute("LevelBoard", levelVo);
    }

//    // 회원 기존 등급 조회
//    @GetMapping("/findUserMembership")
//    public Long levelUp(@Param("userNumber")Long userNumber){
//        Long userMembership = adminService.matchingMembership(userNumber);
//        return userMembership;
//    }

    // 상품 리스트
    @GetMapping("/storeList")
    public void storeList(CriteriaAdminList criteriaAdminList, Model model){
        List<StoreDto> storeList = adminService.findStoreList(criteriaAdminList);
        model.addAttribute("storeList", storeList);
        model.addAttribute("pageInfo", new PageAdminListVo(criteriaAdminList, adminService.getStoreTotal()));
    }

    // 상품 읽어오기
    @GetMapping("/storeRead")
    public void storeRead(){

    }

    // 상품 올리기
    @GetMapping("/storeUpload")
    public void storeUpload(){}




}
