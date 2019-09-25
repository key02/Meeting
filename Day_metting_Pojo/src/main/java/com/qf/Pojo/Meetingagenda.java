package com.qf.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meetingagenda {

  private Integer id;
  private String meetingAgendaName;
  private Date meetingAgendaTime;
  private String meetingAgendaPosition;
  private Integer meetingInformId;
  private String details;

}
