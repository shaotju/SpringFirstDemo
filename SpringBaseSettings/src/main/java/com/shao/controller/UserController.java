package com.shao.controller;

import com.shao.model.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by ShaoXinming on 2016/11/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static  final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/userTest")
    public String getUserTest(){
        return "/userTest";
    }
    @RequestMapping(value = "/userJson")
    @ResponseBody
    public User getUserJson(HttpServletRequest request,User user){
        logger.info("User name:{}  User age:{} ",user.getName(),user.getAge());
        User userNew = new User();
        userNew.setName("shao");
        userNew.setAge(28);
        return  user;
    }
    @RequestMapping(value = "/userJsonList")
    @ResponseBody
    public List<User> getUserList(HttpServletRequest httpServletRequest){
        List<User> userList = new ArrayList<User>();
        User userNew = new User();
        userNew.setName("shao");
        userNew.setAge(28);
        userList.add(userNew);
        userList.add(userNew);
        userList.add(userNew);
        userList.add(userNew);
        return  userList;
    }
    @RequestMapping(value = "/userJsonMap")
    @ResponseBody
    public Map<Integer,User> getUserMap(HttpServletRequest httpServletRequest){
        Map<Integer,User> userMap = new HashMap<Integer,User>();
        User userNew = new User();
        userNew.setName("shao");
        userNew.setAge(28);
        userMap.put(1,userNew);
        userMap.put(2,userNew);
        userMap.put(3,userNew);
        userMap.put(4,userNew);
        return  userMap;
    }
    @RequestMapping(value = "/userJsonObject")
    @ResponseBody
    public String getUserJsonObject(HttpServletRequest httpServletRequest){
        User user = new User();
        user.setAge(40);
        user.setName("wang");
        JSONObject json = JSONObject.fromObject(user);
//        json.put("name","Shao Ximing");
//        json.put("age",30);
        User userNew = (User)JSONObject.toBean(json,User.class);
        String ret = json.toString();
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        JSONArray jsonArray = JSONArray.fromObject(arrayList);
        ret = jsonArray.toString();
        Object obj;
        return  ret;
    }
}
