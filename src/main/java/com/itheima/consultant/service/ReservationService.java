package com.itheima.consultant.service;

import com.itheima.consultant.mapper.ReservationMapper;
import com.itheima.consultant.pojo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationMapper reservationMapper;

    //添加预约信息的方法
    public void insert(Reservation reservation){
        reservationMapper.insert(reservation);
    }

    //查询预约信息的方法
    public Reservation findByPhone(String phone){
        return reservationMapper.findByPhone(phone);
    }
}
