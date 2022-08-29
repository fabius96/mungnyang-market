package com.hanghae.mungnayng.domain.item.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Lob;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ItemResponseDto {
    private Long id;
    private Boolean isMine;
    private String nickname;
    private String title;
    @Lob
    private String content;
    private String petCategory;
    private String itemCategory;
    private String itemImgs;
    private String location;
    private Long commentCnt;
    private Long zzimCnt;
    private Long viewCnt;
    private String createdAt;
    private String modifiedAt;
}
