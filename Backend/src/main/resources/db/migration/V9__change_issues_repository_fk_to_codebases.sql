ALTER TABLE issues DROP FOREIGN KEY fk_issues_repo;

ALTER TABLE issues
    ADD CONSTRAINT fk_issues_codebase
        FOREIGN KEY (repository_id) REFERENCES codebases(id);