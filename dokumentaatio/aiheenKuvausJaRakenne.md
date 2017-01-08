## Aiheenmäärittely

Kuten Pickover, Clifford A:n The Math Book (2009) noteerasi: 

> [it was] the most successful new game of the 1970s. (Pickover, Clifford, 442)

**Aihe:** Kyse on israelilaisen Mordecai Meirowitzin luomasta **Mastermind** nimisestä lautapelistä, jossa yhden pelaajan tulee pyrkiä ratkaisemaan toisen pelaajan rakentama värikoodi. Pähkinänkuoressa se sisältää eri värisiä nappuloita, joista toinen valitsee haluamansa yhdistelmän ja piilottaa tämän yhdistelmän vastapelaajaltaan. Yhdistelmiä on yhteensä 1296. Ratkaisija tekee arvauksen ja laittaa sitä vastaavat pallot omaan riviinsä. Peli etenee niin, että vastaaja kertoo moniko pallo arvaajalla on oikean värinen ja oikealla paikalla (merkitään punaisella) ja moniko pallo on oikean värinen, mutta väärällä paikalla (merkitään valkoisella). Neljä punaista merkkiä tarkoittaa oikeaa vastausta.

Käytännössä tulevaa peliä kuvaavat seuraavat suuntaviivat: 

- [x] Se toteutetaan Javalla
- [x] Käyttäjä tulee arpomaan oikeaa ratkaisua koneelta   

**Käyttäjät:** Opiskelija, Opetushallinto, sekä lähiössä lopeensa arkeensa tylsistynyt individuaali

**Kaikkien käyttäjien toiminnot:** 

	-järjestelmään kirjautuminen
		*onnistuu jos salasana ja käyttäjätunnus oikein 
	-oikean rivin arvaus

**Koneen toiminnot:**

	-kertoo käyttäjälle, menikö rivi oikein





### Tuntikirjanpito
Päivä | Tunnit | Kuvaus
--------------- | ----- | ------
19.12.2016 | 2.5h | Aiheen suunnittelua ja repon luonti
27.12.2016 | 4.5h | Mainin aloittamista ja testien tekoa
31.12.2016 | 5.0h | Toiminnallisuuksien jakamista ja muuta
03.01.2017 | 9.0h | Testien korjausta, metodien muokkausta ja pomin korjausta
04.01.2017 | 3.0h | Javadocien lisäys, raporttien lisäys, luokkakaavion korjaus, GUIn hahmottelua ja aloitusta
06.01.2017 | 4.0h | Testien tekoa, javadocin päivitystä
07.01.2017 | 6.0h | Player ja Number luokat logiikkaan, laajennuksia, testejä
08.01.2017 | 7.0h | Uusia metodeja, sekvenssikaaviot, luokkakaavion päivitys, testejä

### Luokkakaavio 

![Alt text](https://yuml.me/28952192)

### Sekvenssikaaviot

![Alt text](SequenceDiagram667.png)

![Alt text](SequenceDiagram668.png)

![Alt text](SequenceDiagram669.png)

![Alt text](SequenceDiagram670.png)
