package com.linky.connecship.bean;

import java.util.List;

/**
 * Created by linky on 2018/3/1.
 * 关于人的相关信息，包括这个人的
 * 姓名
 * 性别
 * 生日
 *
 * 配偶/女朋友
 * 子女
 * 当前常用地址
 * 朋友
 *
 * 最近聊天的话题
 *
 */
public class Person {

    public String name;
    public String gender;
    public String avatar;
    public String birthday;
    public String phone_call;
    public String current_address;

    public Person other_half;
    public List<Person> parent;
    public List<Person> children;
    public List<Person> friends;

    public RelaEnum relatives;

//    兴趣爱好、感兴趣的话题
    public List<String> interest;

//    个人印象和标签
    public List<String> tags;

    public String last_talk;

    // 个人经历
    public String experience;
}






















