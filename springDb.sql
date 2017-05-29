--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.7
-- Dumped by pg_dump version 9.5.7

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: persons; Type: TABLE; Schema: public; Owner: spring
--

CREATE TABLE persons (
    id integer NOT NULL,
    name character varying(64) NOT NULL,
    age integer NOT NULL
);


ALTER TABLE persons OWNER TO spring;

--
-- Name: persons_id_seq; Type: SEQUENCE; Schema: public; Owner: spring
--

CREATE SEQUENCE persons_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE persons_id_seq OWNER TO spring;

--
-- Name: persons_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: spring
--

ALTER SEQUENCE persons_id_seq OWNED BY persons.id;


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: spring
--

ALTER TABLE ONLY persons ALTER COLUMN id SET DEFAULT nextval('persons_id_seq'::regclass);


--
-- Data for Name: persons; Type: TABLE DATA; Schema: public; Owner: spring
--

COPY persons (id, name, age) FROM stdin;
1	aaaa	32
2	bbbb	37
3	cccc	25
4	dddd	19
5	eeee	18
6	ffff	26
7	gggg	35
8	hhhh	30
9	kkkk	39
10	pppp	29
\.


--
-- Name: persons_id_seq; Type: SEQUENCE SET; Schema: public; Owner: spring
--

SELECT pg_catalog.setval('persons_id_seq', 10, true);


--
-- Name: persons_pkey; Type: CONSTRAINT; Schema: public; Owner: spring
--

ALTER TABLE ONLY persons
    ADD CONSTRAINT persons_pkey PRIMARY KEY (id);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

