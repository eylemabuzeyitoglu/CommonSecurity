package com.BlogWebApp.Common.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlogRequest {
    private String title;
    private String fullContent;
    private String shortContent;
    private String imgUrl;
}
