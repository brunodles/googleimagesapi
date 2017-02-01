package com.github.brunodles.googleimagesapi;

import com.mscharhag.oleaster.runner.OleasterRunner;
import org.junit.runner.RunWith;

import java.util.List;

import static com.mscharhag.oleaster.matcher.Matchers.expect;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.*;

/**
 * Created by bruno on 24/06/16.
 */
@RunWith(OleasterRunner.class)
public class ImagesApiTest {

    private List<String> urls;

    {
        describe("Given a ImageApi", () -> {
            describe(".findUrls", () -> {
                describe("when the page have one image", () -> {
                    beforeEach(() -> urls = ImagesApi.findUrls(PAGE_WITH_ONE));
                    it("should have size equals to 1", () -> {
                        expect(urls.size()).toEqual(1);
                    });
                    it("should return a image url", () -> {
                        expect(urls.get(0)).toEqual("http://data.whicdn.com/images/10344805/black-hair-emo-emo-girl-girl-julie-elizabeth-long-hair-Favim.com-58218_large.jpg");
                    });
                });
                describe("when the page have nine images", () -> {
                    beforeEach(() -> urls = ImagesApi.findUrls(PAGE_WITH_NINE));
                    it("should have size equals to 9", () -> {
                        expect(urls.size()).toEqual(9);
                    });
                    it("should return a image url", () -> {
                        expect(urls.get(0)).toEqual("http://soopermag.com/wp-content/uploads/2013/07/black-emo-girl-with-fringe.jpg");
                    });
                });
            });
        });
    }

    private static final String PAGE_WITH_ONE = "{\"cb\":21,\"cr\":6,\"id\":\"uOQO7EWen81tWM:\",\"isu\":\"pinterest.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":664,\"ou\":\"http://data.whicdn.com/images/10344805/black-hair-emo-emo-girl-girl-julie-elizabeth-long-hair-Favim.com-58218_large.jpg\",\"ow\":500,\"pt\":\"black-hair-emo-emo-girl-girl-julie-elizabeth-long-hair-Favim.com ...\",\"rid\":\"Ie2zHZwtW4lUVM\",\"ru\":\"https://www.pinterest.com/pin/377246906261320611/\",\"s\":\"Learn more at data.whicdn.com\",\"sc\":1,\"th\":259,\"tu\":\"https://encrypted-tbn2.gstatic.com/images?q\\u003dtbn:ANd9GcQsviHJiWeNayj-W__szbpvtlDFQZP1HAG2pqRtWhiV2FE4TTvo\",\"tw\":195}";
    private static final String PAGE_WITH_NINE = "<div data-async-context=\"query:emo%20girl\" id=\"ires\"><div eid=\"mGRtV6aDG4SGwQSKzLiICQ\" id=\"rso\"><div id=\"isr_mc\"><div jsaction=\"ivg_o:r.Y3_Yr-vUUA0\" data-rtid=\"i_xwaeti7ehQ\" jsl=\"$t t-JGVC7pVLhug;$x 0;\" class=\"r-i_xwaeti7ehQ\"><div style=\"display:none\" jsl=\"$t t-0KJ7S2xq-iE;$x 0;\" class=\"r-iflRkIVdI19g\"></div><div id=\"rg\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQuT0IMSgB\"><div style=\"visibility:hidden\" data-jiis=\"up\" data-async-type=\"ichunk\" id=\"rg_s\" class=\"y yi\" data-async-rclass=\"search\"><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwgzKAAwAA\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"x5qGMzt86hWRwM:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 640&nbsp;&#215;&nbsp;640 - soopermag.com </span></div></div></a><div class=\"rg_meta\">{\"cb\":21,\"cl\":15,\"cr\":12,\"ct\":3,\"id\":\"x5qGMzt86hWRwM:\",\"isu\":\"soopermag.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":640,\"ou\":\"http://soopermag.com/wp-content/uploads/2013/07/black-emo-girl-with-fringe.jpg\",\"ow\":640,\"pt\":\"emo girl with purple scene hair | Sooper Mag\",\"rid\":\"-3lG5mtzmfROGM\",\"ru\":\"http://soopermag.com/emo-hairstyles-ideas/emo-girl-with-purple-scene-hair/\",\"s\":\"black emo girl with fringe\",\"sc\":1,\"th\":225,\"tu\":\"https://encrypted-tbn2.gstatic.com/images?q\\u003dtbn:ANd9GcRxhOkTDj5wvKUwZYnVtVSpXcoFtZuBdVBW9AJ6o5JC7TXe0fZl2g\",\"tw\":225}</div></div><!--n--><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwg0KAEwAQ\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"uLu2A5UqAxKZgM:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 375&nbsp;&#215;&nbsp;500 - fanpop.com </span></div></div></a><div class=\"rg_meta\">{\"cb\":21,\"cl\":9,\"cr\":9,\"ct\":6,\"id\":\"uLu2A5UqAxKZgM:\",\"isu\":\"fanpop.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":500,\"ou\":\"http://images4.fanpop.com/image/photos/16700000/maheen-emo-girls-16792899-375-500.jpg\",\"ow\":375,\"pt\":\"emo girls images maheen wallpaper and background photos (16792899)\",\"rid\":\"oRTYzmuKybja6M\",\"ru\":\"http://www.fanpop.com/clubs/emo-girls/images/16792899/title/maheen-photo\",\"s\":\"\",\"sc\":1,\"th\":259,\"tu\":\"https://encrypted-tbn2.gstatic.com/images?q\\u003dtbn:ANd9GcRu0cYdwOrV1x2k5m-BqjT07k85wm7cQCYKLG1x6H44XOPIZViQ\",\"tw\":194}</div></div><!--n--><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwg1KAIwAg\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"W5IAQAvPFGxFcM:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 431&nbsp;&#215;&nbsp;500 - pa-dise.tumblr.com </span></div></div></a><div class=\"rg_meta\">{\"cb\":12,\"cl\":12,\"id\":\"W5IAQAvPFGxFcM:\",\"isu\":\"pa-dise.tumblr.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":500,\"ou\":\"http://65.media.tumblr.com/eae39f0beaeecf225e073ec418d68a3c/tumblr_mnmmod3OXZ1ssrpa1o1_500.jpg\",\"ow\":431,\"pt\":\"Two Kings\",\"rid\":\"0tFN2OxnqyXZSM\",\"ru\":\"http://pa-dise.tumblr.com/\",\"s\":\"CURTAM A PAGE https://www.facebook.com/pages/Two\",\"sc\":1,\"th\":242,\"tu\":\"https://encrypted-tbn0.gstatic.com/images?q\\u003dtbn:ANd9GcR7v0vtf8YCaFi8hsiunRqP-P8pIFqIA0Qj1QlOVPk2KLfK200CFg\",\"tw\":208}</div></div><!--n--><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwg2KAMwAw\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"1t4Ay7dXrOLMoM:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 225&nbsp;&#215;&nbsp;300 - fanpop.com </span></div></div></a><div class=\"rg_meta\">{\"cb\":6,\"id\":\"1t4Ay7dXrOLMoM:\",\"isu\":\"fanpop.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":300,\"ou\":\"http://images2.fanpop.com/images/photos/7000000/-Emo-Girl-emo-girls-7096663-225-300.jpg\",\"ow\":225,\"pt\":\"emo girls images [Emo Girl] wallpaper and background photos (7096663)\",\"rid\":\"Lwf3UOnn0hfipM\",\"ru\":\"http://www.fanpop.com/clubs/emo-girls/images/7096663/title/emo-girl-photo\",\"s\":\"\",\"sc\":1,\"th\":240,\"tu\":\"https://encrypted-tbn0.gstatic.com/images?q\\u003dtbn:ANd9GcQ9GJKIaJI2Qoy4ot3pByoRlhDVr4cEuuWaSDZE3qrGyzUGiL64\",\"tw\":180}</div></div><!--n--><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwg3KAQwBA\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"L0CqXqoISKVmsM:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 500&nbsp;&#215;&nbsp;665 - pinterest.com </span></div></div></a><div class=\"rg_meta\">{\"cb\":21,\"cr\":12,\"id\":\"L0CqXqoISKVmsM:\",\"isu\":\"pinterest.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":665,\"ou\":\"https://s-media-cache-ak0.pinimg.com/736x/f9/f3/be/f9f3be2d264b482036080396702e8d71.jpg\",\"ow\":500,\"pt\":\"26 Things Only Former Emo Kids Will Understand | Emo, Selfie and ...\",\"rid\":\"z4GB8s50vBc9EM\",\"ru\":\"https://www.pinterest.com/pin/335940453427812879/\",\"s\":\"Emo Girls, Hairstyles Highlights, Emo Hairstyles, Scene Emo, Emo Scene Hairstyles, Hairstyles For Girls, Hair Color, Scene Girls\",\"sc\":1,\"th\":259,\"tu\":\"https://encrypted-tbn2.gstatic.com/images?q\\u003dtbn:ANd9GcSELWAI5xLqiL0IO3YEwmDSTwW04fV9GjpGkR_YoJFguGrgV1iA\",\"tw\":195}</div></div><!--n--><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwg4KAUwBQ\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"5CGVQn0ExHnJHM:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 1600&nbsp;&#215;&nbsp;1000 - smshousepk.com </span></div></div></a><div class=\"rg_meta\">{\"cb\":3,\"cl\":3,\"cr\":21,\"id\":\"5CGVQn0ExHnJHM:\",\"isu\":\"smshousepk.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":1000,\"ou\":\"http://smshousepk.com/wp-content/uploads/2014/12/Latest-Emo-Girl-Wallpapers.jpg\",\"ow\":1600,\"pt\":\"Latest Emo Girl Wallpapers | SmsHouSePk\",\"rid\":\"oKcF6jztoWE5wM\",\"ru\":\"http://smshousepk.com/latest-emo-girl-wallpapers/\",\"s\":\"Latest Emo Girl Wallpapers\",\"sc\":1,\"th\":177,\"tu\":\"https://encrypted-tbn1.gstatic.com/images?q\\u003dtbn:ANd9GcSR1weibnIkfuJe-3jKQcVZPGIOtgLwzgfLJwh2aTiMErlDqP__Rw\",\"tw\":284}</div></div><!--n--><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwg5KAYwBg\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"gLlu_cbKfblUNM:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 570&nbsp;&#215;&nbsp;759 - creativemisha.com </span></div></div></a><div class=\"rg_meta\">{\"cb\":12,\"cr\":9,\"id\":\"gLlu_cbKfblUNM:\",\"isu\":\"creativemisha.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":759,\"ou\":\"http://www.fungur.com/uploads/2010/08/emo-girls09.jpg\",\"ow\":570,\"pt\":\"25 Cute And Cool Emo Pictures For Girls | creativemisha\",\"rid\":\"-70045ahhIPcfM\",\"ru\":\"http://creativemisha.com/emo-girls/\",\"s\":\"Elegant Emo Gal\",\"sc\":1,\"th\":259,\"tu\":\"https://encrypted-tbn2.gstatic.com/images?q\\u003dtbn:ANd9GcQt7JjEKsqtR6_dPsgSegWQe9EpPm9E9AmDmVRKEIVg72Ymq1-7\",\"tw\":194}</div></div><!--n--><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwg6KAcwBw\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"y2rHamy8YcQAeM:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 425&nbsp;&#215;&nbsp;500 - fanpop.com </span></div></div></a><div class=\"rg_meta\">{\"cb\":21,\"cl\":3,\"id\":\"y2rHamy8YcQAeM:\",\"isu\":\"fanpop.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":500,\"ou\":\"http://images2.fanpop.com/images/photos/6500000/Emo-Girl-emo-6577130-425-500.jpg\",\"ow\":425,\"pt\":\"Emo images Emo Girl wallpaper and background photos (6577130)\",\"rid\":\"3DPbBMtBPy_yWM\",\"ru\":\"http://www.fanpop.com/clubs/emo/images/6577130/title/emo-girl-photo\",\"s\":\"Emo images Emo Girl wallpaper and background photos\",\"sc\":1,\"th\":244,\"tu\":\"https://encrypted-tbn3.gstatic.com/images?q\\u003dtbn:ANd9GcRinrJi3uZJbh70UltMAXj6IRVduUiM2eVY6S7jk-QGSTGozG0T\",\"tw\":207}</div></div><!--n--><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwg7KAgwCA\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"jfgnSmB6HBnX0M:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 400&nbsp;&#215;&nbsp;600 - tumblr18.com </span></div></div></a><div class=\"rg_meta\">{\"cb\":21,\"cl\":12,\"cr\":6,\"ct\":18,\"id\":\"jfgnSmB6HBnX0M:\",\"isu\":\"tumblr18.com\",\"itg\":false,\"ity\":\"jpg\",\"oh\":600,\"ou\":\"http://www.tumblr18.com/t18/2013/10/Scary-but-lovely-emo-girl.jpg\",\"ow\":400,\"pt\":\"Emo Images, Pictures\",\"rid\":\"SgCoAMInRyxmCM\",\"ru\":\"http://www.tumblr18.com/images/emo/page/2/\",\"s\":\"Download\",\"sc\":1,\"th\":275,\"tu\":\"https://encrypted-tbn3.gstatic.com/images?q\\u003dtbn:ANd9GcSL2HfKYNQ5xTCYc_br9stWyf2l5nY1TwaSE4pCmgppbO7_VKsAgQ\",\"tw\":183}</div></div><!--n--><!--m--><div class=\"rg_di rg_el ivg-i\" data-ved=\"0ahUKEwimr9yhj8HNAhUEQ5AKHQomDpEQMwg8KAkwCQ\"><a jsaction=\"fire.ivg_o;mouseover:str.hmov;mouseout:str.hmou\" class=\"rg_l\"><img data-sz=\"f\" name=\"uht7w06EkXgfJM:\" class=\"rg_i\" alt=\"Resultado de imagem para emo girl\" jsaction=\"load:str.tbn\" onload=\"google.aft&&google.aft(this)\"><div class=\"_aOd rg_ilm\"><div class=\"rg_ilmbg\"><span class=\"rg_ilmn\"> 450&nbsp;&#215;&nbsp;448 - e2ua.com </span></div></div></a><div class=\"rg_meta\">";
}