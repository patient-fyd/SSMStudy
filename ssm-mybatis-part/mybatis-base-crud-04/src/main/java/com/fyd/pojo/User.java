package com.fyd.pojo;

import lombok.Data;

@Data //lombok
public class User {
  private Integer id;
  private String username;
  private String password;
}