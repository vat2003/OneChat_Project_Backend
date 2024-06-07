package com.project.shopapp.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupDTO {
    @JsonProperty("groupName")
    private String groupName;

    @JsonProperty("adminGroup")
    private Long adminGroup;

}
