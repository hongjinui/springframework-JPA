package com.test.springframework.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDelivery is a Querydsl query type for Delivery
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDelivery extends EntityPathBase<Delivery> {

    private static final long serialVersionUID = -1143755647L;

    public static final QDelivery delivery = new QDelivery("delivery");

    public final StringPath dvrCancelyn = createString("dvrCancelyn");

    public final DateTimePath<java.time.LocalDateTime> dvrCompletetime = createDateTime("dvrCompletetime", java.time.LocalDateTime.class);

    public final StringPath dvrCompleteyn = createString("dvrCompleteyn");

    public final NumberPath<Long> dvrId = createNumber("dvrId", Long.class);

    public QDelivery(String variable) {
        super(Delivery.class, forVariable(variable));
    }

    public QDelivery(Path<? extends Delivery> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDelivery(PathMetadata metadata) {
        super(Delivery.class, metadata);
    }

}

