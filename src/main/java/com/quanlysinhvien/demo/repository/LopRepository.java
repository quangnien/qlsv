/*******************************************************************************
 * Class        ：AbstactAccountRepository
 * Created date ：2018/01/31
 * Lasted date  ：2018/01/31
 * Author       ：phatvt
 * Change log   ：2018/01/31：01-00 phatvt create a new
 ******************************************************************************/
package com.quanlysinhvien.demo.repository;

import org.springframework.data.mirage.repository.MirageRepository;

import com.quanlysinhvien.demo.entity.LopEntity;

public interface LopRepository extends MirageRepository<LopEntity, Long> {
//    LpgwMaTable findByCustomerNumer(@Param("customerNumber") String customerNumber);
//
//    int countSearchMasterDataMaTable(@Param("searchDto") MasterDataMaTableSearchDto searchDto);
//
//    List<MasterDataMaTableSearchResultsDto> searchMasterDataMaTable(@Param("offSet") int offSet, @Param("sizeOfPage") int sizeOfPage,
//                                                                    @Param("searchDto") MasterDataMaTableSearchDto searchDto);
//
//    Optional<LpgwMaTable> findOneMaTableById(@Param("id") Long id);
//
//    int countMaTableByCustomerNumber(@Param("customerNumber") String customerNumber,
//                                     @Param("department") String department);
//
//    List<MasterDataMaTableSearchResultsDto> exportExcel(@Param("searchDto") MasterDataMaTableSearchDto searchDto);
//
//    int countMaTableByIdAndCustomerNumber(@Param("id") Long lpgwMaTableId,
//                                          @Param("customerNumber") String customerNumber,
//                                          @Param("department") String department);
//
//    Optional<LpgwMaTable> findByCustomerNumberPassB0(@Param("customerNumber") String customerNumber,
//                                                     @Param("department") String department);
//
//    Optional<LpgwMaTable> findByCustomerNumberPassT0(@Param("customerNumber") String customerNumber);
//
//    Optional<LpgwMaTable> findByCustomerNumberIsCus(@Param("customerNumber") String customerNumber);
}
