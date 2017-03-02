package com.brunodles.googleimagesapi

import com.mscharhag.oleaster.runner.OleasterRunner
import com.mscharhag.oleaster.runner.StaticRunnerSupport.beforeEach
import com.mscharhag.oleaster.runner.StaticRunnerSupport.describe
import org.junit.runner.RunWith

@RunWith(OleasterRunner::class)
class QueryBuilderImplTest {

    private var queryBuilder: QueryBuilderImpl? = null

    init {
        describe("Given a QueryBuilder") { beforeEach { queryBuilder = QueryBuilderImpl() } }
    }
}