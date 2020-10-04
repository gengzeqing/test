package com.ruiyou;

import com.mapper.SkuConverter;
import com.pojo.Sku;
import com.pojo.SkuDTO;

/**
 * po > dto 间的转换
 * 使用时需要添加 MapStruct  依赖
 */
public class MapStruct {


    public static void main(String[] args) {
//        Sku dto = new Sku();
//        dto.setColor("blue");
//        dto.setFomatDate(new Date());
//        SkuDTO skuDTO = SkuConverter.MAPPER.damin2dto(dto,new User("",12));
//        User user = new User("小", 12);
//        User user1 = new User("大", 13);
//        User user2 = new User("多", 14);
//        List<User> userList = new ArrayList<>();
//        userList.add(user);
//        userList.add(user1);
//        userList.add(user2);
//
//        List<SkuDTO> skuDTOS = SkuConverter.MAPPER.damin2dto(userList);
//        System.out.println(skuDTOS);

        Sku sku = new Sku();
        //sku.setPrice("12");
        sku.setColor("blue");
        sku.setCode("0134");
        SkuDTO skuDTO2 = SkuConverter.MAPPER.damin2dto(sku);
        System.out.println(skuDTO2);
        String itemName = skuDTO2.getItemName();
        System.out.println(itemName);
    }
}
