package com.example.the_boxes_server.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Timestamp;

@NoArgsConstructor
@Entity
@Data
@Table(name = "app_user") // 테이블 이름 변경
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId; // 사용자 ID (기본 키)

    @Column(unique = true, length = 50, nullable = false)
    private String username; // 사용자 아이디

    @Column(length = 20, nullable = false)
    private String password; // 비밀번호

    @Column(length = 20, nullable = false)
    private String name; // 이름

    private String birthdate; // 생년월일
    private String phone; // 전화번호
    private String address; // 주소

    @Column(length = 100, nullable = false)
    private String email; // 이메일

    private String companyAddress; // 회사 주소
    private String industry; // 업종
    private String position; // 직책
    private String logisticsCenterLocation; // 물류 센터 위치
    private String equipment; // 보유 장비

    @CreationTimestamp
    private Timestamp createdAt; // 생성 시간

    @Builder
    public User(
            Integer userId,
            String username,
            String password,
            String name,
            String birthdate,
            String phone,
            String address,
            String email,
            String companyAddress,
            String industry,
            String position,
            String logisticsCenterLocation,
            String equipment
    ) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.birthdate = birthdate;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.companyAddress = companyAddress;
        this.industry = industry;
        this.position = position;
        this.logisticsCenterLocation = logisticsCenterLocation;
        this.equipment = equipment;
    }
}
