package com.buschmais.jqassistant.neo4j.backend.bootstrap;

import org.neo4j.graphdb.GraphDatabaseService;

/**
 * Abstract base class for {@link EmbeddedNeo4jServer}s.
 */
public abstract class AbstractEmbeddedNeo4jServer implements EmbeddedNeo4jServer {

    protected GraphDatabaseService graphDatabaseService;

    @Override
    public void init(GraphDatabaseService graphDatabaseService, boolean apocEnabled) {
        configure(graphDatabaseService, apocEnabled);
        this.graphDatabaseService = graphDatabaseService;
    }

    @Override
    public GraphDatabaseService getGraphDatabaseService() {
        return graphDatabaseService;
    }

    /**
     * Configure the {@link GraphDatabaseService} instances.
     *
     * @param graphDatabaseService
     *            The {@link GraphDatabaseService}.
     * @param apocEnabled
     */
    protected abstract void configure(GraphDatabaseService graphDatabaseService, boolean apocEnabled);

}
