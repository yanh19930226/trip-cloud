package com.trip.article.qo;

import com.trip.core.qo.QueryObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinationQuery extends QueryObject {

    private Long parentId;
}
