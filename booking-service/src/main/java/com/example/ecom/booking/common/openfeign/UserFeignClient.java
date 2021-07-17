package com.example.ecom.booking.common.openfeign;

import com.example.ecom.booking.domain.valueobject.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Component
@FeignClient("user-service")
public interface UserFeignClient {

  @RequestMapping(method = RequestMethod.GET, value = "/v1/user")
  Collection<UserVO> getUser(@RequestParam("name") String name) throws Exception;

  @RequestMapping(method = RequestMethod.POST, value = "/v1/user")
  UserVO postUser(@RequestBody UserVO user) throws Exception;

  @RequestMapping(method = RequestMethod.PUT, value = "/v1/user/{id}")
  void putUser(@PathVariable("id") long id, @RequestBody UserVO user) throws Exception;

  @RequestMapping(method = RequestMethod.DELETE, value = "/v1/user/{id}")
  void deleteUser(@PathVariable("id") long id) throws Exception;
}
