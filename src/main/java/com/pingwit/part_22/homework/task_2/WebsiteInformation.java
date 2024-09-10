package com.pingwit.part_22.homework.task_2;

import java.time.LocalDate;

// отформатируй код
class WebsiteInformation {
  private String userName;
  private String webSiteName;
  private LocalDate localDate;

    public WebsiteInformation(String userName, String webSiteName, LocalDate localDate) {
        this.userName = userName;
        this.webSiteName = webSiteName;
        this.localDate = localDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWebSiteName() {
        return webSiteName;
    }

    public void setWebSiteName(String webSiteName) {
        this.webSiteName = webSiteName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "WebsiteInformation{" +
                "userName='" + userName + '\'' +
                ", webSiteName='" + webSiteName + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
