package com.ssafy.admin.controller;

import com.ssafy.member.model.MemberDto;
import com.ssafy.member.model.service.MemberService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//RestController를 여기에 선언하면 해당 Controller의 모든 메소드가 RestController 이다
//CrossOrigin("*") -> 모든 Url에 대해서 오픈하겠다  / url과 메소드를 추가해서 url과 메소드만 허용하겠다! 로  설정가능
@RestController
//@Controller
@RequestMapping("/admin")
@CrossOrigin("*")
@Api(tags = {"회원관리"})
public class AdminUserController {

    private static final Logger logger = LoggerFactory.getLogger(AdminUserController.class);

    private MemberService memberService;

    @Autowired
    public AdminUserController(MemberService memberService) {
        this.memberService = memberService;
    }


//	@RequestMapping(value = "/user", method = RequestMethod.GET, headers = { "Content-type=application/json" })
//	public List<MemberDto> userList() throws Exception {
//		List<MemberDto> list = memberService.listMember(null);
//		logger.debug("회원목록 : {}", list);
//
//		return list;
////        return memberService.listMember();
//	}
//
//
//	@RequestMapping(value = "/user", method = RequestMethod.POST, headers = { "Content-type=application/json" })
//	public List<MemberDto> userRegister(@RequestBody MemberDto memberDto) throws Exception {
//		memberService.joinMember(memberDto);
//		return memberService.listMember(null);
//	}
//
//
//	@RequestMapping(value = "/user/{userid}", method = RequestMethod.GET, headers = { "Content-type=application/json" })
//	public MemberDto userInfo(@PathVariable("userid") String userid) throws Exception {
//		return memberService.getMember(userid);
//	}
//
//
//	@RequestMapping(value = "/user", method = RequestMethod.PUT, headers = { "Content-type=application/json" })
//	public List<MemberDto> userModify(@RequestBody MemberDto memberDto) throws Exception {
//		memberService.updateMember(memberDto);
//		return memberService.listMember(null);
//	}
//
//
//	@RequestMapping(value = "/user/{userid}", method = RequestMethod.DELETE, headers = {
//			"Content-type=application/json" })
//	public List<MemberDto> userDelete(@PathVariable("userid") String userid) throws Exception {
//		memberService.deleteMember(userid);
//		return memberService.listMember(null);
//	}


//  ResponseEntity 를 사용하면 상태 를 같이 전달할수있따 
//	ResponseEntity<타입> (보낼꺼 , HttpStatus.OK)  -> 정상처리 
//  ResponseEntity<void> ( HttpStatus.false)    -> 정상처리 X 
//
//  {userid}
//   @PathVariable("userid")  - URL 경로에 있는 값을 파라미터로 추출


    @ApiOperation(value = "회원목록", notes = "회원의 <b>전체 목록</b>을 출력합니다")
    @ApiResponses({@ApiResponse(code = 200, message = "회원목록")})
    @GetMapping(value = "/user")
    public ResponseEntity<?> userList() {
        logger.debug("userList call");
        try {
            List<MemberDto> list = memberService.listMember(null);
            if (list != null && !list.isEmpty()) {
                return new ResponseEntity<List<MemberDto>>(list, HttpStatus.OK);
//				return new ResponseEntity<List<MemberDto>>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return exceptionHandling(e);
        }

    }

    @PostMapping(value = "/user")
    public ResponseEntity<?> userRegister(@RequestBody MemberDto memberDto) {
        logger.debug("userRegister memberDto : {}", memberDto);
        try {
            memberService.joinMember(memberDto);
            List<MemberDto> list = memberService.listMember(null);
            return new ResponseEntity<List<MemberDto>>(list, HttpStatus.OK);
//			return new ResponseEntity<Integer>(cnt, HttpStatus.CREATED);
        } catch (Exception e) {
            return exceptionHandling(e);
        }

    }

    @ApiOperation(value = "회원목록", notes = "회원의 한명의 <b>정보</b>을 출력합니다")
    @ApiResponses({@ApiResponse(code = 200, message = "회원목록"), @ApiResponse(code = 500, message = "서버에러")})
    @ApiImplicitParams({@ApiImplicitParam(name = "userid", value = "검색 아이디", required = true, dataType = "String")})
    @GetMapping(value = "/user/{userid}")
    public ResponseEntity<?> userInfo(@PathVariable("userid") String userId) {
        logger.debug("userInfo userid : {}", userId);
        try {
            MemberDto memberDto = memberService.getMember(userId);
            if (memberDto != null) return new ResponseEntity<MemberDto>(memberDto, HttpStatus.OK);
            else return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return exceptionHandling(e);
        }
    }

    @PutMapping(value = "/user")
    public ResponseEntity<?> userModify(@RequestBody MemberDto memberDto) {
        logger.debug("userModify memberDto : {}", memberDto);
        try {
            memberService.updateMember(memberDto);
            List<MemberDto> list = memberService.listMember(null);
            return new ResponseEntity<List<MemberDto>>(list, HttpStatus.OK);
        } catch (Exception e) {
            return exceptionHandling(e);
        }
    }

    @DeleteMapping(value = "/user/{userid}")
    public ResponseEntity<?> userDelete(@PathVariable("userid") String userId) {
        logger.debug("userDelete userid : {}", userId);
        try {
            memberService.deleteMember(userId);
            List<MemberDto> list = memberService.listMember(null);
            return new ResponseEntity<List<MemberDto>>(list, HttpStatus.OK);
        } catch (Exception e) {
            return exceptionHandling(e);
        }
    }

    private ResponseEntity<String> exceptionHandling(Exception e) {
        e.printStackTrace();
        return new ResponseEntity<String>("Error : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
