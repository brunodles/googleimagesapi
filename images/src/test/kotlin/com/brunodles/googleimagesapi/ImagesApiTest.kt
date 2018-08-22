package com.brunodles.googleimagesapi

import ResourceHelper
import com.greghaskins.spectrum.Spectrum
import com.greghaskins.spectrum.Spectrum.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.runner.RunWith
import org.mockito.Mockito

@RunWith(Spectrum::class)
class ImagesApiTest {

    init {
        describe("Given a ImageApi") {
            var urls: List<String>? = null
            describe(".listImageUrls") {
                describe("when the page have one image") {
                    beforeEach { urls = ImagesApi.findUrlsOnPage(ResourceHelper.getFileAsString("page_with_one")) }
                    it("should have size equals to 1") { assertThat(urls!!.size).isEqualTo(1) }
                    it("should return a image url") { assertThat(urls!![0]).isEqualTo(PAGE_WITH_ONE_RESULT) }
                }
                describe("when the page have nine images") {
                    beforeEach { urls = ImagesApi.findUrlsOnPage(ResourceHelper.getFileAsString("page_with_nine")) }
                    it("should have size equals to 9") { assertThat(urls!!.size).isEqualTo(9) }
                    it("should return a images urls") {
                        for (i in PAGE_WITH_NINE_RESULT.indices) {
                            assertThat(urls!![i]).isEqualTo(PAGE_WITH_NINE_RESULT[i])
                        }
                    }
                }
            }
            describe(".queryBuilder") {
                val pageFetcher = Mockito.mock(PageFetcher::class.java)
                describe("when search for a anime name") {
                    beforeEach {
                        Mockito.`when`(pageFetcher.fetchPage(Mockito.anyString())).thenReturn(ResourceHelper.getFileAsString("search_chuunibyou"))
                    }
                    it("should return the correct list") {
                        val first = ImagesApi.queryBuilder(pageFetcher).query("Chuunibyou").listImageUrls().first()
                        assertThat(first).isEqualTo("https://www.animeunited.com.br/wp-content/uploads/2017/10/Chuunibyou-Demo-Koi-ga-Shitai-chuunibyou-demo-koi-ga-shitai-34840480-1280-720.jpg")
                    }
                }
            }
        }
    }

    companion object {

        val PAGE_WITH_ONE_RESULT = "http://data.whicdn.com/images/10344805/black-hair-emo-emo-girl-girl-julie-elizabeth-long-hair-Favim.com-58218_large.jpg"

        val PAGE_WITH_NINE_RESULT = arrayOf(
                "http://soopermag.com/wp-content/uploads/2013/07/black-emo-girl-with-fringe.jpg",
                "http://images4.fanpop.com/image/photos/16700000/maheen-emo-girls-16792899-375-500.jpg",
                "http://65.media.tumblr.com/eae39f0beaeecf225e073ec418d68a3c/tumblr_mnmmod3OXZ1ssrpa1o1_500.jpg",
                "http://images2.fanpop.com/images/photos/7000000/-Emo-Girl-emo-girls-7096663-225-300.jpg",
                "https://s-media-cache-ak0.pinimg.com/736x/f9/f3/be/f9f3be2d264b482036080396702e8d71.jpg",
                "http://smshousepk.com/wp-content/uploads/2014/12/Latest-Emo-Girl-Wallpapers.jpg",
                "http://www.fungur.com/uploads/2010/08/emo-girls09.jpg",
                "http://images2.fanpop.com/images/photos/6500000/Emo-Girl-emo-6577130-425-500.jpg",
                "http://www.tumblr18.com/t18/2013/10/Scary-but-lovely-emo-girl.jpg"
        )
    }
}
