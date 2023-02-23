package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{ymd}")//曜日の取り出し
    public String dispDayOfWeek(@PathVariable String ymd) {
        int y = Integer.parseInt(ymd.substring(0, 4));
        int m = Integer.parseInt(ymd.substring(4, 6));
        int d = Integer.parseInt(ymd.substring(6, 8));

        LocalDate date = LocalDate.of(y, m, d);
        DayOfWeek w = date.getDayOfWeek();

        return w + ("（指定日が" + ymd + "の場合）");
    }

    @GetMapping("/plus/{val1}/{val2}")//足し算
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return res + "（数値１が" + val1 + "、数値2が" + val2 + "の場合）";
    }

    @GetMapping("/minus/{val1}/{val2}")//引き算
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return res + "（数値１が" + val1 + "、数値2が" + val2 + "の場合）";
    }

    @GetMapping("/times/{val1}/{val2}")//掛け算
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return res + "（数値１が" + val1 + "、数値2が" + val2 + "の場合）";
    }

    @GetMapping("/divide/{val1}/{val2}")//割り算
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return res + "（数値１が" + val1 + "、数値2が" + val2 + "の場合）";
    }


}
