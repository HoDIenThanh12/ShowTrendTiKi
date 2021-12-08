package com.example.tiki.view.viewmau.view1;

import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("name")
    private String superName;

    private String realname;

    @SerializedName("team")
    private String team;

    public Results(String superName, String realname, String team) {
        this.superName = superName;
        this.realname = realname;
        this.team = team;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
