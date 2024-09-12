package com.example.memberszone.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Autogenerated ID

    @Column(nullable = false, length = 100)
    private String name;  // Member's name

    @Column(nullable = false, length = 100)
    private String email;  // Member's email

    @Column(name = "phone_number", nullable = false, length = 15)
    private String phoneNumber;  // Member's phone number

    @Column(length = 255)
    private String address;  // Member's address

    @Enumerated(EnumType.STRING)
    @Column(name = "fees_status", nullable = false)
    private FeesStatus feesStatus;  // Fees status (paid or pending)

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method", nullable = false)
    private PaymentMethod paymentMethod;  // Payment method (cash or online)

    @Column(name = "plan_name", nullable = false, length = 100)
    private String planName;  // Plan name associated with the member

    @Column(name = "join_date", nullable = false)
    private LocalDate joinDate ;  // Join date (default to current date)

    @Column(name = "end_date")
    private LocalDate endDate;  // End date (to be calculated)

    @Enumerated(EnumType.STRING)
    @Column(name = "membership_status", nullable = false)
    private MembershipStatus membershipStatus;  // Membership status (active or inactive)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gym_id", nullable = false)
    private Admin gymId;  // 

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FeesStatus getFeesStatus() {
        return feesStatus;
    }

    public void setFeesStatus(FeesStatus feesStatus) {
        this.feesStatus = feesStatus;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public MembershipStatus getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(MembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus;
    }



    // Enum for Fees Status
    public enum FeesStatus {
        PAID,
        PENDING
    }

    // Enum for Payment Method
    public enum PaymentMethod {
        CASH,
        ONLINE
    }

    // Enum for Membership Status
    public enum MembershipStatus {
        ACTIVE,
        INACTIVE
    }

	public Admin getGymId() {
		return gymId;
	}

	public void setGymId(Admin gymId) {
		this.gymId = gymId;
	}
}
