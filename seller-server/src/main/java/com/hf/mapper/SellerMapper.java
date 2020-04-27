package com.hf.mapper;

import com.hf.Seller;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerMapper {

    @Select("select * from seller")
    @Results(id = "sellerMap", value = {@Result(id = true, property = "sellerId", column = "seller_id"),
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "addressDetail", column = "address_detail"),
            @Result(property = "linkmanName", column = "linkman_name"),
            @Result(property = "linkmanQq", column = "linkman_qq"),
            @Result(property = "linkmanMobile", column = "linkman_mobile"),
            @Result(property = "linkmanEmail", column = "linkman_email"),
            @Result(property = "licenseNumber", column = "license_number"),
            @Result(property = "taxNumber", column = "tax_number"),
            @Result(property = "orgNumber", column = "org_number"),
            @Result(property = "logoPic", column = "logo_pic"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "legalPerson", column = "legal_person"),
            @Result(property = "legalPersonCardId", column = "legal_person_card_id"),
            @Result(property = "bankUser", column = "bank_user"),
            @Result(property = "bankName", column = "bank_name")})
    List<Seller> findAll();

    @Select("select * from seller where seller_id=#{sellerId}")
    @ResultMap("sellerMap")
    Seller findById(String sellerId);

    @Insert("insert into seller(seller_id,name,nick_name,password,email,mobile,telephone,status,address_detail,linkman_name,linkman_qq,linkman_mobile,linkman_email,license_number,tax_number,org_number,address,logo_pic,brief,create_time,legal_person,legal_person_card_id,bank_user,bank_name) values (#{sellerId},#{name},#{nickName},#{password},#{email},#{mobile},#{telephone},#{status},#{addressDetail},#{linkmanName},#{linkmanQq},#{linkmanMobile},#{linkmanEmail},#{licenseNumber},#{taxNumber},#{orgNumber},#{address},#{logoPic},#{brief},#{createTime},#{legalPerson},#{legalPersonCardId},#{bankUser},#{bankName})")
    @ResultMap("sellerMap")
    void insert(Seller seller);

    @Update("update seller set name=#{name}, nick_name=#{nickName}, password=#{password}, email=#{email}, mobile=#{mobile}, telephone=#{telephone}, status=#{status}, address_detail=#{addressDetail}, linkman_name=#{linkmanName}, linkman_qq=#{linkmanQq}, linkman_mobile=#{linkmanMobile}, linkman_email=#{linkmanEmail}, license_number=#{licenseNumber}, tax_number=#{taxNumber}, org_number=#{orgNumber}, address=#{address}, logo_pic=#{logoPic}, brief=#{brief}, create_time=#{createTime}, legal_person=#{legalPerson}, legal_person_card_id=#{legalPersonCardId}, bank_user=#{bankUser}, bank_name=#{bankName} where seller_id=#{sellerId}")
    @ResultMap("sellerMap")
    void update(Seller seller);

    @Delete("delete from seller where seller_id=#{sellerId}")
    @ResultMap("sellerMap")
    void delete(String sellerId);
}