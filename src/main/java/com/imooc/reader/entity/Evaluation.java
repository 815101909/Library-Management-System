package com.imooc.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("evaluation")
public class Evaluation {
    @TableId(type = IdType.AUTO)
    private Long evaluationId;
    private Long bookId;
    private String content;
    private Integer score;
    private Long memberId;
    private Date createTime;
    private Integer enjoy;
    private String state;
    private String disableReason;
    private Date disableTime;

    public Evaluation() {
    }

    public Long getEvaluation() {
        return evaluationId;
    }

    public void setEvaluation(Long evaluation) {
        this.evaluationId = evaluation;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getEnjoy() {
        return enjoy;
    }

    public void setEnjoy(Integer enjoy) {
        this.enjoy = enjoy;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDisableReason() {
        return disableReason;
    }

    public void setDisableReason(String disableReason) {
        this.disableReason = disableReason;
    }

    public Date getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(Date disableTime) {
        this.disableTime = disableTime;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "evaluation=" + evaluationId +
                ", bookId=" + bookId +
                ", content='" + content + '\'' +
                ", score=" + score +
                ", memberId=" + memberId +
                ", createTime=" + createTime +
                ", enjoy=" + enjoy +
                ", state='" + state + '\'' +
                ", disableReason='" + disableReason + '\'' +
                ", disableTime=" + disableTime +
                '}';
    }
}
