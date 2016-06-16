package com.androidx.androidx.model;

public class Event {
    private Actor actor;
    private Repository repo;

    public String getUserLogin() {
        return actor.login;
    }

    public String getRepositoryName() {
        return repo.name;
    }

    private static class Actor {
        private String login;
    }

    public static class Repository {
        public String name;
    }
}
