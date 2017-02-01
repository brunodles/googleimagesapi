package com.github.brunodles.googleimagesapi;

import com.mscharhag.oleaster.runner.OleasterRunner;
import com.mscharhag.oleaster.runner.StaticRunnerSupport;
import org.junit.runner.RunWith;

import static com.mscharhag.oleaster.runner.StaticRunnerSupport.beforeEach;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.describe;
import static org.junit.Assert.*;

/**
 * Created by bruno on 24/06/16.
 */
@RunWith(OleasterRunner.class)
public class QueryBuilderImplTest {

    private QueryBuilderImpl queryBuilder;

    {
        describe("Given a QueryBuilder", () -> {
            beforeEach(() -> queryBuilder = new QueryBuilderImpl());
        });
    }
}