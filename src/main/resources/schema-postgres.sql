--
-- PostgreSQL database dump
--

-- Dumped from database version 10.2
-- Dumped by pg_dump version 10.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: Klient; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE "Klient" (
    id integer NOT NULL,
    email character(30),
    kontakt_telefon smallint,
    aadress character(50),
    eesnimi character(70),
    perenimi character(70)
);


ALTER TABLE "Klient" OWNER TO postgres;

--
-- Name: Klient_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE "Klient_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE "Klient_id_seq" OWNER TO postgres;

--
-- Name: Klient_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE "Klient_id_seq" OWNED BY "Klient".id;


--
-- Name: Tellimus; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE "Tellimus" (
    id integer NOT NULL,
    "kuupäev" date,
    hind_kokku real,
    on_makstud boolean,
    klient_id integer
);


ALTER TABLE "Tellimus" OWNER TO postgres;

--
-- Name: Tellimus_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE "Tellimus_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE "Tellimus_id_seq" OWNER TO postgres;

--
-- Name: Tellimus_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE "Tellimus_id_seq" OWNED BY "Tellimus".id;


--
-- Name: Toode; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE "Toode" (
    id integer NOT NULL,
    nimetus character(80),
    kirjeldus character(500),
    kaal real,
    hind real,
    kogus_laos integer
);


ALTER TABLE "Toode" OWNER TO postgres;

--
-- Name: Toode_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE "Toode_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE "Toode_id_seq" OWNER TO postgres;

--
-- Name: Toode_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE "Toode_id_seq" OWNED BY "Toode".id;


--
-- Name: toode_tellimus; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE toode_tellimus (
    tellimus_id integer NOT NULL,
    toode_id integer NOT NULL,
    kogus integer NOT NULL
);


ALTER TABLE toode_tellimus OWNER TO postgres;

--
-- Name: Klient id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "Klient" ALTER COLUMN id SET DEFAULT nextval('"Klient_id_seq"'::regclass);


--
-- Name: Tellimus id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "Tellimus" ALTER COLUMN id SET DEFAULT nextval('"Tellimus_id_seq"'::regclass);


--
-- Name: Toode id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "Toode" ALTER COLUMN id SET DEFAULT nextval('"Toode_id_seq"'::regclass);


--
-- Name: Klient Klient_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "Klient"
    ADD CONSTRAINT "Klient_pkey" PRIMARY KEY (id);


--
-- Name: Tellimus Tellimus_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "Tellimus"
    ADD CONSTRAINT "Tellimus_pkey" PRIMARY KEY (id);


--
-- Name: Toode Toode_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "Toode"
    ADD CONSTRAINT "Toode_pkey" PRIMARY KEY (id);


--
-- Name: toode_tellimus tellimus_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY toode_tellimus
    ADD CONSTRAINT tellimus_id FOREIGN KEY (tellimus_id) REFERENCES "Tellimus"(id);


--
-- Name: Tellimus tellimus_klient_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "Tellimus"
    ADD CONSTRAINT tellimus_klient_fk FOREIGN KEY (klient_id) REFERENCES "Klient"(id);


--
-- Name: toode_tellimus toode_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY toode_tellimus
    ADD CONSTRAINT toode_id FOREIGN KEY (toode_id) REFERENCES "Toode"(id);


--
-- PostgreSQL database dump complete
--

