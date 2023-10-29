package com.example.sabrina_hm6_3m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sabrina_hm6_3m.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private  lateinit var animeAdapter: AnimeAdapter
    private  var animeList= ArrayList<AnimeModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        animeAdapter = AnimeAdapter(animeList)
        binding.rvAnime.adapter = animeAdapter
    }
    private fun loadData(){
        animeList.add(AnimeModel("https://content2.rozetka.com.ua/goods/images/big/177932287.png","Attack on Titan","24 Episodes"))
        animeList.add(AnimeModel("https://media.kg-portal.ru/tv/o/onepiece/posters/onepiece_2.png","One Piece"))
        animeList.add(AnimeModel("https://cdn.europosters.eu/image/1300/posters/hunter-x-hunter-book-key-art-i97793.jpg","Hunter X Hunter","148 Episodes"))
        animeList.add(AnimeModel("https://i.pinimg.com/originals/28/68/22/2868227acfdb3f5d5dae9be3aff37eb4.png","One Punch Man","24 Episodes"))
        animeList.add(AnimeModel("https://anitrendz.net/news/wp-content/uploads/2019/04/Demon-Slayer-Kimetsu-no-Yaiba-Official-Poster.png","Demon Slayer","Episodes"))
        animeList.add(AnimeModel("https://b1.filmpro.ru/c/803867.jpg","Your Lie in April","22 Episodes"))
        animeList.add(AnimeModel("https://i.pinimg.com/originals/84/e8/61/84e861ecef7dcc7c81e43ceef58d6aed.png","Naruto","500 Episodes"))
        animeList.add(AnimeModel("https://i.redd.it/nyscgxepf6r41.jpg","Violet Evergarden","12 Episodes"))
        animeList.add(AnimeModel("https://img.animeschedule.net/production/assets/public/img/anime/jpg/default/shi-guang-dai-li-ren-dc26424b1f.jpg","Link Click","11 Episodes"))
        animeList.add(AnimeModel("https://i.pinimg.com/originals/ac/43/52/ac4352f877cd4265d69538bd7532b7b3.jpg","Jujutsu Kaisen","23 Episodes"))
        animeList.add(AnimeModel("https://i.pinimg.com/originals/68/65/43/686543ce1b351826fc426225a25cd3bb.png","My hero Academia","24 Episodes"))
        animeList.add(AnimeModel("https://posterspy.com/wp-content/uploads/2020/06/Haikyu-Poster-small.png","Haikyuu!!!","24 Episodes"))
        animeList.add(AnimeModel("https://m.media-amazon.com/images/M/MV5BNGYyNmI3M2YtNzYzZS00OTViLTkxYjAtZDIyZmE1Y2U1ZmQ2XkEyXkFqcGdeQXVyMTA4NjE0NjEy._V1_.jpg","Your Name",))
        animeList.add(AnimeModel("https://img1.od-cdn.com/ImageType-400/0292-1/%7BD2679EAE-0CF9-4A11-A8FA-BE58FB2DDEE7%7DIMG400.JPG","Howl's Moving Castle",))
        animeList.add(AnimeModel("https://m.media-amazon.com/images/I/71lbiSNsC-L._AC_UF894,1000_QL80_.jpg","Horimiya","24 Episodes"))
        animeList.add(AnimeModel("https://kinogo.media/uploads/posts/2022-04/1649571169-2061331358.jpg","Spy × Family","25 Episodes"))
        animeList.add(AnimeModel("https://m.media-amazon.com/images/I/813q45sQSCL._AC_UF1000,1000_QL80_.jpg","Pokemon","1257 Episodes"))
        animeList.add(AnimeModel("https://m.media-amazon.com/images/I/91oRmZ53OBL.jpg","Assassination Classroom","24 Episodes"))
        animeList.add(AnimeModel("https://m.media-amazon.com/images/I/61+D4zBEigL._AC_UF894,1000_QL80_.jpg","Bakugan","189 Episodes"))
        animeList.add(AnimeModel("https://upload.wikimedia.org/wikipedia/ru/7/7f/Suzume_no_Tojimari_poster.jpg","Suzume"))

    }
}