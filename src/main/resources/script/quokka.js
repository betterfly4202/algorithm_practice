/**
 * Created by betterFLY on 12/08/2019.
 */
let url = "https://search.wemakeprice.com/search?keyword=%EC%83%A4%ED%94%84&isRec=1&sort=cheap";
let result = '';
if(url.includes("sort")){
    result = url.split("sort=")[1];
}

console.log(result);