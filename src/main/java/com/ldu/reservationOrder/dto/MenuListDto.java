package com.ldu.reservationOrder.dto;

import com.ldu.reservationOrder.entity.Menu;
import lombok.Data;

import java.util.List;

@Data
public class MenuListDto {
    private List<Menu> menuList;
}
