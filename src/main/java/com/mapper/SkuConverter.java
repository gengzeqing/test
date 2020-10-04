package com.mapper;


import com.mapper.mapperValidate.MyStringLongMapper;
import com.pojo.Sku;
import com.pojo.SkuDTO;
import com.pojo.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 对于原参数进行非 null的 判断
 *     nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
 *
 * 对于原参数为空的情况下 返回一个空的对象
 *     nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT
 *
 * 忽略不匹配的属性
 *     unmappedTargetPolicy = ReportingPolicy.IGNORE
 */
@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,uses = MyStringLongMapper.class)
public interface SkuConverter {

    SkuConverter MAPPER = Mappers.getMapper(SkuConverter.class);

    /**
     * source 原参数 target 目标参数
     * ignore 忽略(true) 不对属性字段进行复制
     * defaultValue 默认值
     * dateFormat 对于时间类型的数据进行格式化
     *
     * @param dto
     * @return
     */
    @Mappings({
            // 对于属性字段不同的数据进行映射
            @Mapping(source = "id", target = "skuId"),
            @Mapping(source = "code", target = "skuCode"),
            @Mapping(source = "price", target = "skuPrice"),
            // 该属性会被忽略不进行处理
            //@Mapping(target = "color", constant = "测试数据"),
            // 时间类型进行格式化处理
            @Mapping(source = "fomatDate", target = "fomatDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    })
    SkuDTO damin2dto(Sku dto);


    /**
     * 对于有两个原参数的数据可以使用 名称.属性
     * 如：user.name
     * @param dto
     * @param user
     * @return
     */
    @Mappings({
            @Mapping(source = "user.name", target = "itemName"),
            @Mapping(source = "dto.id", target = "skuId"),
            @Mapping(source = "dto.code", target = "skuCode"),
            @Mapping(source = "dto.price", target = "skuPrice"),
            @Mapping(target = "color",ignore = true),
            @Mapping(source = "dto.fomatDate", target = "fomatDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    })
    SkuDTO damin2dto(Sku dto, User user);


    /**
     * 对于集合数据的转换
     * 1.首先需要对象数据进行转换
     * 2.集合数据生成的方法会自动调用单个方法的数据
     * @param user
     * @return
     */
    @Mappings({
            @Mapping(source = "name", target = "itemName"),
            @Mapping(source = "age", target = "skuCode"),
            // 赋值为常量属性
            @Mapping(target = "color", constant = "测试数据")
    })
    SkuDTO damin2dto(User user);
    List<SkuDTO> damin2dto(List<User> user);



}
