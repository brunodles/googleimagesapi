package com.github.brunodles.googleimagesapi

import com.mscharhag.oleaster.runner.OleasterRunner
import com.mscharhag.oleaster.runner.StaticRunnerSupport
import org.junit.runner.RunWith

import com.mscharhag.oleaster.runner.StaticRunnerSupport.beforeEach
import com.mscharhag.oleaster.runner.StaticRunnerSupport.describe
import org.junit.Assert.*

/**
 * Created by bruno on 24/06/16.
 */
@RunWith(OleasterRunner::class)
class QueryBuilderImplTest {

    private var queryBuilder: QueryBuilderImpl? = null

    init {
        describe("Given a QueryBuilder") { beforeEach { queryBuilder = QueryBuilderImpl() } }
    }
}