package com.chang.cn.retrofitdouban.entity;

import android.text.TextUtils;

import java.util.List;

/**
 * 电影条目数据实体
 * Created by chang on 2016/7/18.
 */
public class MovieData {


    /**
     * count : 20
     * start : 0
     * total : 90
     * subjects : [{"rating":{"max":10,"average":6.2,"stars":"35","min":0},"genres":["动作","冒险"],"title":"泰山归来：险战丛林","casts":[{"alt":"https://movie.douban.com/celebrity/1049485/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/427.jpg","large":"https://img1.doubanio.com/img/celebrity/large/427.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/427.jpg"},"name":"亚历山大·斯卡斯加德","id":"1049485"},{"alt":"https://movie.douban.com/celebrity/1272303/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1389939796.3.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1389939796.3.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1389939796.3.jpg"},"name":"玛格特·罗比","id":"1272303"},{"alt":"https://movie.douban.com/celebrity/1054408/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/31870.jpg","large":"https://img3.doubanio.com/img/celebrity/large/31870.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/31870.jpg"},"name":"塞缪尔·杰克逊","id":"1054408"}],"collect_count":870,"original_title":"The Legend of Tarzan","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1275147/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/9900.jpg","large":"https://img3.doubanio.com/img/celebrity/large/9900.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/9900.jpg"},"name":"大卫·叶茨","id":"1275147"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2359323802.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2359323802.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2359323802.jpg"},"alt":"https://movie.douban.com/subject/2131669/","id":"2131669"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情"],"title":"欲望森林","casts":[{"alt":null,"avatars":null,"name":"李圣雄","id":null},{"alt":null,"avatars":null,"name":"张咏娴","id":null},{"alt":null,"avatars":null,"name":"黄盛量","id":null}],"collect_count":68,"original_title":"欲望森林","subtype":"MovieData","directors":[{"alt":null,"avatars":null,"name":"周三省","id":null},{"alt":null,"avatars":null,"name":"周重阳","id":null},{"alt":null,"avatars":null,"name":"肖宇杭","id":null}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2356831433.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2356831433.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2356831433.jpg"},"alt":"https://movie.douban.com/subject/26789821/","id":"26789821"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","动作"],"title":"绝地逃亡","casts":[{"alt":"https://movie.douban.com/celebrity/1054531/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/694.jpg","large":"https://img3.doubanio.com/img/celebrity/large/694.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/694.jpg"},"name":"成龙","id":"1054531"},{"alt":"https://movie.douban.com/celebrity/1050059/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1691.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1691.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1691.jpg"},"name":"范冰冰","id":"1050059"},{"alt":"https://movie.douban.com/celebrity/1031900/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1410111501.75.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1410111501.75.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1410111501.75.jpg"},"name":"约翰尼·诺克斯维尔","id":"1031900"}],"collect_count":315,"original_title":"Skiptrace","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1032052/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/21181.jpg","large":"https://img3.doubanio.com/img/celebrity/large/21181.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/21181.jpg"},"name":"雷尼·哈林","id":"1032052"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2366057661.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2366057661.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2366057661.jpg"},"alt":"https://movie.douban.com/subject/24529353/","id":"24529353"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","爱情"],"title":"泡沫之夏","casts":[{"alt":"https://movie.douban.com/celebrity/1347985/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/BrbnU9r7uewcel_avatar_uploaded1423890664.7.jpg","large":"https://img1.doubanio.com/img/celebrity/large/BrbnU9r7uewcel_avatar_uploaded1423890664.7.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/BrbnU9r7uewcel_avatar_uploaded1423890664.7.jpg"},"name":"黄灿灿","id":"1347985"},{"alt":"https://movie.douban.com/celebrity/1313369/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/48629.jpg","large":"https://img1.doubanio.com/img/celebrity/large/48629.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/48629.jpg"},"name":"罗仲谦","id":"1313369"},{"alt":"https://movie.douban.com/celebrity/1351757/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1454673455.23.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1454673455.23.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1454673455.23.jpg"},"name":"严禹豪","id":"1351757"}],"collect_count":532,"original_title":"泡沫之夏","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1339538/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1422791828.94.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1422791828.94.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1422791828.94.jpg"},"name":"赖俊羽","id":"1339538"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2363746233.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2363746233.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2363746233.jpg"},"alt":"https://movie.douban.com/subject/25830800/","id":"25830800"},{"rating":{"max":10,"average":7,"stars":"35","min":0},"genres":["动作","历史","冒险"],"title":"巴霍巴利王：开端","casts":[{"alt":"https://movie.douban.com/celebrity/1337710/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/KneBVU7FdSscel_avatar_uploaded1391068830.54.jpg","large":"https://img3.doubanio.com/img/celebrity/large/KneBVU7FdSscel_avatar_uploaded1391068830.54.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/KneBVU7FdSscel_avatar_uploaded1391068830.54.jpg"},"name":"帕拉巴斯","id":"1337710"},{"alt":"https://movie.douban.com/celebrity/1350818/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1437830956.04.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1437830956.04.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1437830956.04.jpg"},"name":"拉纳·达格巴帝","id":"1350818"},{"alt":"https://movie.douban.com/celebrity/1229458/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1424079667.27.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1424079667.27.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1424079667.27.jpg"},"name":"安努舒卡·谢蒂","id":"1229458"}],"collect_count":7071,"original_title":"Baahubali: The Beginning","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1325290/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/VUhhcCTzVhIcel_avatar_uploaded1353924831.96.jpg","large":"https://img3.doubanio.com/img/celebrity/large/VUhhcCTzVhIcel_avatar_uploaded1353924831.96.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/VUhhcCTzVhIcel_avatar_uploaded1353924831.96.jpg"},"name":"S·S·拉贾穆里","id":"1325290"}],"year":"2015","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2363089554.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2363089554.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2363089554.jpg"},"alt":"https://movie.douban.com/subject/25753326/","id":"25753326"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["爱情"],"title":"天亮之前","casts":[{"alt":"https://movie.douban.com/celebrity/1041390/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/29009.jpg","large":"https://img1.doubanio.com/img/celebrity/large/29009.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/29009.jpg"},"name":"郭富城","id":"1041390"},{"alt":"https://movie.douban.com/celebrity/1312862/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1429449422.48.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1429449422.48.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1429449422.48.jpg"},"name":"杨子姗","id":"1312862"},{"alt":"https://movie.douban.com/celebrity/1042568/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/13664.jpg","large":"https://img3.doubanio.com/img/celebrity/large/13664.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/13664.jpg"},"name":"郝蕾","id":"1042568"}],"collect_count":221,"original_title":"天亮之前","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1313736/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1389112994.03.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1389112994.03.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1389112994.03.jpg"},"name":"吴中天","id":"1313736"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2363294351.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2363294351.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2363294351.jpg"},"alt":"https://movie.douban.com/subject/26352440/","id":"26352440"},{"rating":{"max":10,"average":8.2,"stars":"40","min":0},"genres":["动画"],"title":"哆啦A梦：新·大雄的日本诞生","casts":[{"alt":"https://movie.douban.com/celebrity/1024195/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1375424738.93.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1375424738.93.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1375424738.93.jpg"},"name":"水田山葵","id":"1024195"},{"alt":"https://movie.douban.com/celebrity/1326329/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1358580306.49.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1358580306.49.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1358580306.49.jpg"},"name":"大原惠美","id":"1326329"},{"alt":"https://movie.douban.com/celebrity/1020284/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/36838.jpg","large":"https://img1.doubanio.com/img/celebrity/large/36838.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/36838.jpg"},"name":"嘉数由美","id":"1020284"}],"collect_count":123,"original_title":"ドラえもん 新・のび太の日本誕生","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1342622/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"八锹新之介","id":"1342622"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2366455395.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2366455395.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2366455395.jpg"},"alt":"https://movie.douban.com/subject/26527993/","id":"26527993"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","动画","冒险"],"title":"刺猬小子之天生我刺","casts":[{"alt":null,"avatars":null,"name":"大猬","id":null},{"alt":null,"avatars":null,"name":"小明","id":null}],"collect_count":67,"original_title":"刺猬小子之天生我刺","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1355172/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"黄健明","id":"1355172"}],"year":"2015","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2366248857.jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2366248857.jpg","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2366248857.jpg"},"alt":"https://movie.douban.com/subject/26276436/","id":"26276436"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["悬疑","惊悚","恐怖"],"title":"魔都凶音","casts":[{"alt":"https://movie.douban.com/celebrity/1323786/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1427712239.94.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1427712239.94.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1427712239.94.jpg"},"name":"姜雯","id":"1323786"},{"alt":"https://movie.douban.com/celebrity/1314386/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1422338246.39.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1422338246.39.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1422338246.39.jpg"},"name":"于小伟","id":"1314386"},{"alt":"https://movie.douban.com/celebrity/1318734/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1373771162.41.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1373771162.41.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1373771162.41.jpg"},"name":"张瑶","id":"1318734"}],"collect_count":48,"original_title":"魔都凶音","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1329298/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/QI6QZBYIwQcel_avatar_uploaded1369280790.87.jpg","large":"https://img1.doubanio.com/img/celebrity/large/QI6QZBYIwQcel_avatar_uploaded1369280790.87.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/QI6QZBYIwQcel_avatar_uploaded1369280790.87.jpg"},"name":"彭鹏华","id":"1329298"}],"year":"2016","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2366699579.jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2366699579.jpg","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2366699579.jpg"},"alt":"https://movie.douban.com/subject/26772860/","id":"26772860"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["犯罪","悬疑","恐怖"],"title":"恐怖爱情故事之死亡公路","casts":[{"alt":"https://movie.douban.com/celebrity/1357832/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1468241809.03.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1468241809.03.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1468241809.03.jpg"},"name":"牟雨晨","id":"1357832"},{"alt":"https://movie.douban.com/celebrity/1356542/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1463467468.93.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1463467468.93.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1463467468.93.jpg"},"name":"冯可","id":"1356542"},{"alt":"https://movie.douban.com/celebrity/1357834/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"高名扬","id":"1357834"}],"collect_count":52,"original_title":"恐怖爱情故事之死亡公路","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1336003/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1384226190.51.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1384226190.51.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1384226190.51.jpg"},"name":"鸿水","id":"1336003"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2366029712.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2366029712.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2366029712.jpg"},"alt":"https://movie.douban.com/subject/26609224/","id":"26609224"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","动画"],"title":"少年师爷之大禹宝藏","casts":[],"collect_count":94,"original_title":"少年师爷之大禹宝藏","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1358633/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"肖智慧","id":"1358633"},{"alt":"https://movie.douban.com/celebrity/1359032/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"陈凌超","id":"1359032"}],"year":"2016","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2363306377.jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2363306377.jpg","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2363306377.jpg"},"alt":"https://movie.douban.com/subject/26647121/","id":"26647121"},{"rating":{"max":10,"average":6,"stars":"30","min":0},"genres":["剧情","动作","犯罪"],"title":"红色警戒999","casts":[{"alt":"https://movie.douban.com/celebrity/1022593/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/2199.jpg","large":"https://img1.doubanio.com/img/celebrity/large/2199.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/2199.jpg"},"name":"卡西·阿弗莱克","id":"1022593"},{"alt":"https://movie.douban.com/celebrity/1010581/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/9322.jpg","large":"https://img3.doubanio.com/img/celebrity/large/9322.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/9322.jpg"},"name":"切瓦特·埃加福特","id":"1010581"},{"alt":"https://movie.douban.com/celebrity/1027217/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/12510.jpg","large":"https://img3.doubanio.com/img/celebrity/large/12510.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/12510.jpg"},"name":"安东尼·麦凯","id":"1027217"}],"collect_count":3134,"original_title":"Triple 9","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1286634/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/39540.jpg","large":"https://img3.doubanio.com/img/celebrity/large/39540.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/39540.jpg"},"name":"约翰·希尔寇特","id":"1286634"}],"year":"2016","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2364769529.jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2364769529.jpg","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2364769529.jpg"},"alt":"https://movie.douban.com/subject/6875396/","id":"6875396"},{"rating":{"max":10,"average":5.1,"stars":"25","min":0},"genres":["爱情"],"title":"六弄咖啡馆","casts":[{"alt":"https://movie.douban.com/celebrity/1330472/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1385100761.5.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1385100761.5.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1385100761.5.jpg"},"name":"董子健","id":"1330472"},{"alt":"https://movie.douban.com/celebrity/1318260/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1385270440.49.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1385270440.49.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1385270440.49.jpg"},"name":"颜卓灵","id":"1318260"},{"alt":"https://movie.douban.com/celebrity/1275324/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1425307712.95.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1425307712.95.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1425307712.95.jpg"},"name":"林柏宏","id":"1275324"}],"collect_count":686,"original_title":"六弄咖啡馆","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1349108/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"吴子云","id":"1349108"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2367455902.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2367455902.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2367455902.jpg"},"alt":"https://movie.douban.com/subject/26351867/","id":"26351867"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","动作","奇幻"],"title":"封神传奇","casts":[{"alt":"https://movie.douban.com/celebrity/1025146/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1369201135.38.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1369201135.38.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1369201135.38.jpg"},"name":"李连杰","id":"1025146"},{"alt":"https://movie.douban.com/celebrity/1050059/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1691.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1691.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1691.jpg"},"name":"范冰冰","id":"1050059"},{"alt":"https://movie.douban.com/celebrity/1041404/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1368761950.19.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1368761950.19.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1368761950.19.jpg"},"name":"黄晓明","id":"1041404"}],"collect_count":362,"original_title":"封神传奇","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1287130/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/41474.jpg","large":"https://img3.doubanio.com/img/celebrity/large/41474.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/41474.jpg"},"name":"许安","id":"1287130"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2366372816.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2366372816.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2366372816.jpg"},"alt":"https://movie.douban.com/subject/25850122/","id":"25850122"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["动作","悬疑","冒险"],"title":"平安岛","casts":[{"alt":"https://movie.douban.com/celebrity/1275466/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/12953.jpg","large":"https://img3.doubanio.com/img/celebrity/large/12953.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/12953.jpg"},"name":"黄立行","id":"1275466"},{"alt":"https://movie.douban.com/celebrity/1023718/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1403277860.52.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1403277860.52.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1403277860.52.jpg"},"name":"戴立忍","id":"1023718"},{"alt":"https://movie.douban.com/celebrity/1312818/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/47687.jpg","large":"https://img1.doubanio.com/img/celebrity/large/47687.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/47687.jpg"},"name":"焦俊艳","id":"1312818"}],"collect_count":174,"original_title":"平安岛","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1280470/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1388909361.92.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1388909361.92.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1388909361.92.jpg"},"name":"张允炫","id":"1280470"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2251664322.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2251664322.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2251664322.jpg"},"alt":"https://movie.douban.com/subject/25870731/","id":"25870731"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","动作"],"title":"宝贝当家","casts":[{"alt":"https://movie.douban.com/celebrity/1336724/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1386871066.05.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1386871066.05.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1386871066.05.jpg"},"name":"王诗龄","id":"1336724"},{"alt":"https://movie.douban.com/celebrity/1037098/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1603.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1603.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1603.jpg"},"name":"吴镇宇","id":"1037098"},{"alt":"https://movie.douban.com/celebrity/1173971/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/40056.jpg","large":"https://img3.doubanio.com/img/celebrity/large/40056.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/40056.jpg"},"name":"杨千嬅","id":"1173971"}],"collect_count":52,"original_title":"宝贝当家","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1320966/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1421227536.58.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1421227536.58.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1421227536.58.jpg"},"name":"张敏","id":"1320966"}],"year":"2016","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2363065429.jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2363065429.jpg","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2363065429.jpg"},"alt":"https://movie.douban.com/subject/26352361/","id":"26352361"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["动画","奇幻","冒险"],"title":"神秘世界历险记3","casts":[{"alt":"https://movie.douban.com/celebrity/1325738/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1366861983.51.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1366861983.51.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1366861983.51.jpg"},"name":"刘校妤","id":"1325738"},{"alt":"https://movie.douban.com/celebrity/1341268/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"孟泉霖","id":"1341268"},{"alt":null,"avatars":null,"name":"陆  揆","id":null}],"collect_count":16,"original_title":"神秘世界历险记3","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1321732/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1436771114.49.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1436771114.49.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1436771114.49.jpg"},"name":"王云飞","id":"1321732"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2341808952.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2341808952.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2341808952.jpg"},"alt":"https://movie.douban.com/subject/26782088/","id":"26782088"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧"],"title":"情况不妙","casts":[{"alt":"https://movie.douban.com/celebrity/1313907/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/20896.jpg","large":"https://img3.doubanio.com/img/celebrity/large/20896.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/20896.jpg"},"name":"李菁","id":"1313907"},{"alt":"https://movie.douban.com/celebrity/1318973/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/45144.jpg","large":"https://img3.doubanio.com/img/celebrity/large/45144.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/45144.jpg"},"name":"曹云金","id":"1318973"},{"alt":"https://movie.douban.com/celebrity/1319032/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1444800807.11.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1444800807.11.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1444800807.11.jpg"},"name":"马丽","id":"1319032"}],"collect_count":15,"original_title":"情况不妙","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1322525/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"王莉","id":"1322525"}],"year":"2016","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2364921137.jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2364921137.jpg","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2364921137.jpg"},"alt":"https://movie.douban.com/subject/26774772/","id":"26774772"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["悬疑","惊悚"],"title":"催命符","casts":[{"alt":"https://movie.douban.com/celebrity/1351461/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1464833885.71.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1464833885.71.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1464833885.71.jpg"},"name":"郑强","id":"1351461"},{"alt":"https://movie.douban.com/celebrity/1351458/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1453098385.18.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1453098385.18.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1453098385.18.jpg"},"name":"卢蒽洁","id":"1351458"},{"alt":"https://movie.douban.com/celebrity/1351457/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1453098510.9.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1453098510.9.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1453098510.9.jpg"},"name":"姜怡伊","id":"1351457"}],"collect_count":31,"original_title":"催命符","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1351460/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1453097745.37.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1453097745.37.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1453097745.37.jpg"},"name":"周晓鹏","id":"1351460"}],"year":"2015","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2257946514.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2257946514.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2257946514.jpg"},"alt":"https://movie.douban.com/subject/26418060/","id":"26418060"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","战争","悬疑"],"title":"毒中毒","casts":[{"alt":"https://movie.douban.com/celebrity/1274237/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/11111.jpg","large":"https://img3.doubanio.com/img/celebrity/large/11111.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/11111.jpg"},"name":"孙海英","id":"1274237"},{"alt":"https://movie.douban.com/celebrity/1342216/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1420903705.27.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1420903705.27.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1420903705.27.jpg"},"name":"杜双宇","id":"1342216"},{"alt":"https://movie.douban.com/celebrity/1360080/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"阎俊希","id":"1360080"}],"collect_count":15,"original_title":"毒中毒","subtype":"MovieData","directors":[{"alt":"https://movie.douban.com/celebrity/1360078/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"崔志敏","id":"1360078"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2366770264.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2366770264.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2366770264.jpg"},"alt":"https://movie.douban.com/subject/26803692/","id":"26803692"}]
     * title : 即将上映的电影
     */

    private int count;
    private int start;
    private int total;
    private String title;
    /**
     * rating : {"max":10,"average":6.2,"stars":"35","min":0}
     * genres : ["动作","冒险"]
     * title : 泰山归来：险战丛林
     * casts : [{"alt":"https://movie.douban.com/celebrity/1049485/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/427.jpg","large":"https://img1.doubanio.com/img/celebrity/large/427.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/427.jpg"},"name":"亚历山大·斯卡斯加德","id":"1049485"},{"alt":"https://movie.douban.com/celebrity/1272303/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1389939796.3.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1389939796.3.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1389939796.3.jpg"},"name":"玛格特·罗比","id":"1272303"},{"alt":"https://movie.douban.com/celebrity/1054408/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/31870.jpg","large":"https://img3.doubanio.com/img/celebrity/large/31870.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/31870.jpg"},"name":"塞缪尔·杰克逊","id":"1054408"}]
     * collect_count : 870
     * original_title : The Legend of Tarzan
     * subtype : MovieData
     * directors : [{"alt":"https://movie.douban.com/celebrity/1275147/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/9900.jpg","large":"https://img3.doubanio.com/img/celebrity/large/9900.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/9900.jpg"},"name":"大卫·叶茨","id":"1275147"}]
     * year : 2016
     * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2359323802.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2359323802.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2359323802.jpg"}
     * alt : https://movie.douban.com/subject/2131669/
     * id : 2131669
     */

    private List<SubjectsBean> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean {
        /**
         * max : 10
         * average : 6.2
         * stars : 35
         * min : 0
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String original_title;
        private String subtype;
        private String year;
        /**
         * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2359323802.jpg
         * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2359323802.jpg
         * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2359323802.jpg
         */

        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;// 影片类型，最多提供3个
        /**
         * alt : https://movie.douban.com/celebrity/1049485/
         * avatars : {"small":"https://img1.doubanio.com/img/celebrity/small/427.jpg","large":"https://img1.doubanio.com/img/celebrity/large/427.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/427.jpg"}
         * name : 亚历山大·斯卡斯加德
         * id : 1049485
         */

        private List<CastsBean> casts;
        /**
         * alt : https://movie.douban.com/celebrity/1275147/
         * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/9900.jpg","large":"https://img3.doubanio.com/img/celebrity/large/9900.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/9900.jpg"}
         * name : 大卫·叶茨
         * id : 1275147
         */

        private List<DirectorsBean> directors;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<CastsBean> getCasts() {
            return casts;
        }

        public String getCastsString() {
            String CastsString = "";
            if (casts != null && casts.size() > 0) {
                for (CastsBean cast : casts) {
                    if (cast != null && !TextUtils.isEmpty(cast.getName())) {
                        CastsString += cast.getName() + "\b\b";
                    }
                }
            }

            return CastsString;
        }

        public void setCasts(List<CastsBean> casts) {
            this.casts = casts;
        }

        public List<DirectorsBean> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsBean> directors) {
            this.directors = directors;
        }

        public static class RatingBean {
            private int max;
            private double average;
            private String stars;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public double getAverage() {
                return average;
            }

            public String getAverageString() {
                return String.valueOf(average);
            }

            public void setAverage(double average) {
                this.average = average;
            }

            public String getStars() {
                return stars;
            }

            public void setStars(String stars) {
                this.stars = stars;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class CastsBean {
            private String alt;
            /**
             * small : https://img1.doubanio.com/img/celebrity/small/427.jpg
             * large : https://img1.doubanio.com/img/celebrity/large/427.jpg
             * medium : https://img1.doubanio.com/img/celebrity/medium/427.jpg
             */

            private AvatarsBean avatars;
            private String name; // 主演名
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsBean getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBean avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBean {
                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }

        public static class DirectorsBean {
            private String alt;
            /**
             * small : https://img3.doubanio.com/img/celebrity/small/9900.jpg
             * large : https://img3.doubanio.com/img/celebrity/large/9900.jpg
             * medium : https://img3.doubanio.com/img/celebrity/medium/9900.jpg
             */

            private AvatarsBean avatars;
            private String name;
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsBean getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBean avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBean {
                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }
    }
}
