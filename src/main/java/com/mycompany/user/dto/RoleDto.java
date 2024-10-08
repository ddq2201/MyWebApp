package com.mycompany.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class RoleDto {

    private String name; // Role name

    @Override
    public String toString() {
        return "RoleDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
