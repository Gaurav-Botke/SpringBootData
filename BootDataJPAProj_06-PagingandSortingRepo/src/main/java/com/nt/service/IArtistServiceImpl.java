package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.nt.entity.Artist;
import com.nt.repository.IArtistRepository;

@Service
public class IArtistServiceImpl implements IArtistService {
	
	         @Autowired
	         IArtistRepository artRepo;
	          
	         @Override
             public Iterable<Artist> showAllArtistBySorting(boolean asc, String... props) {
            	//prepare the sort object
            	 Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,props);
            	 //use Repo
            	 
            	 Iterable<Artist> artist = artRepo.findAll(sort);
            	 return artist;
            }
	         
	         @Override
	        public Page<Artist> showAllArtistInfoByPage(int pageNo, int pageSize, boolean asc, String props) {
	        //prepare the sort object
	        	  Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,props);
	        	  
	        	  //prepare pageable object
	        	  Pageable pageable = PageRequest.of(pageNo, pageSize);
	        	  
	        	  //use Repo
	        	  Page<Artist> artist = artRepo.findAll(pageable);
	        	 
	        return artist;
	        }
	         
	         @Override
	        public void showDataThroughPagination(int pageSize) {
	        
	        	 //get all count of records
	        	 long count = artRepo.count();
	        	 long pagesCount = count/pageSize;
	        	 if(count%pagesCount!=0)
	        		 pagesCount++;
	        	 
	        		 for(int i=0;i<pagesCount;++i) {
	        			 //create pageable object
	        			 Pageable pageable = PageRequest.of(i, pageSize);
	        			 //get each page record
	        			 Page<Artist> page= artRepo.findAll(pageable);
	        			 System.out.println("-------------------"+(page.getNumber()+1)+" "+(page.getTotalPages()+"---------------"));
	        			 page.getContent().forEach(System.out::println);
	        			 System.out.println("--------------------------------------");
	        		 }
	        	 }
       	 
	      
}
