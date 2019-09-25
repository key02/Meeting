package com.qf.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meetingnews {

  private Integer id;
  private String mettingName;
  private String mettingDescribe;
  private String detailsSite;
  private String mettingNewsType;
  private String image;



}
